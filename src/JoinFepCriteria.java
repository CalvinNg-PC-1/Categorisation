import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;

public class JoinFepCriteria {
	
	public static boolean met(MaintainApplicationVO application) {
			
		if (application.getJoinFEP() == "true") {
			return true;
		} else {
			return false;
		}
				
	}
	
}
