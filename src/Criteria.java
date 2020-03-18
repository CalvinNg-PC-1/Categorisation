import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;
import hk.gov.housingauthority.nhs.common.vo.assignApplication.PriorityInfo;

public interface Criteria {
	
	public static boolean met(MaintainApplicationVO application) {
		
		// Set up criteria for checking here
		
		boolean flag = false;
		
		
		// Rule Version: CATG_019
		if (application.getPhaseCode() == "019") {
			switch (application.getApplicationFormColor())
			{
				case "G":
					
					if (application.getJoinFEP() == "true") { // FEP Indicator
						if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "GE") {
							flag = true;
						}
					} else {
						if(application.getApplicationMemberList().size() > 1) { // Not Singleton
							flag = true;
						} else { // Singleton
							if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "G-1P") {
								flag = true;
							}
						}
					}
									
					break;
				case "W":
					if (application.getJoinFEP() == "true") { // FEP Indicator
						if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "WNE") {
							flag = true;
						}
					} else {
						if(application.getApplicationMemberList().size() > 1) { // Not Singleton
							if (application.getNuclearWithGrandParentAndChild() == "true") { // Nuclear Family
								if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "WOE") {
									flag = true;
								}
							} else if (application.getNuclearWithGrandParentAndChild() == "false") { // Non-nuclear Family
								if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "W") {
									flag = true;
								}
							}						
						} else { // Singleton
							if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "W-1P") {
								flag = true;
							}
						}
					}
					break;
				default:
					break;
			}
			
			if(application.getApplicationMemberList().size() == 1) { // No. of Members is 1
				if (application.getSearchMemberRelationshipCode() == "P") { // Pregnant Indicator
					if (application.getNuclearWithGrandParentAndChild() == "true") { // Nuclear Family
						flag = true;
					}
				} else {
					flag = true;
				}
			} else { // No. of Members > 1
				if (application.getSearchMemberRelationshipCode() == "W" || 
					application.getSearchMemberRelationshipCode() == "F" || 
					application.getSearchMemberRelationshipCode() == "M" || 
					application.getSearchMemberRelationshipCode() == "S" || 
					application.getSearchMemberRelationshipCode() == "D") {
					
					if (application.getNuclearWithGrandParentAndChild() == "true") {
						flag = true;
					}
				} else {
					if (application.getNuclearWithGrandParentAndChild() != "true") {
						flag = true;
					}
				}
			}
		} else if (application.getPhaseCode() == "WF19") {
			if(application.getApplicationMemberList().size() > 1) { // Not Singleton
				if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "F") {
					flag = true;
				}
			} else { // Singleton
				if (((PriorityInfo) application.getCategoryPriority()).getCategoryCode() == "S") {
					flag = true;
				}
			}
		}
		
		return flag;
	}
	
}
