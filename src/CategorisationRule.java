import java.util.List;
import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;

public class CategorisationRule {

	private List<Criteria> criteriaList;
	private String categoryCode;
	
	public List<Criteria> getCriteriaList() {
		return criteriaList;
	}
	
	public void setCriteriaList(List<Criteria> criteriaList) {
		this.criteriaList = criteriaList;
	}
	
	public String getCategoryCode() {
		return categoryCode;
	}
	
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public boolean allCriteriasMet(MaintainApplicationVO application) {
		
		boolean flag = false;
		
		switch (application.getApplicationFormColor())
		{
			case "G":
				
				if(application.getApplicationMemberList().size() > 1) { // Not Singleton
					if (application.getNuclearWithGrandParentAndChild() == "true") { // Nuclear Family
						
					} else if (application.getNuclearWithGrandParentAndChild() == "false") { // Non-nuclear Family
						
					} else {
						
					}
				}
				break;
			case "W":
				
				break;
			default:
				break;
		}
		
		if(application.getApplicationMemberList().size() == 1) {
			if (application.getSearchMemberRelationshipCode() == "P") {
				if (application.getNuclearWithGrandParentAndChild() == "true") {
					flag = true;
				}
			} else {
				if (application.getNuclearWithGrandParentAndChild() != "true") {
					flag = true;
				}
			}
		} else {
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
		
		
		return flag;
	}
	
}
