import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JoinFepCriteria {
	
	public static boolean met(MaintainApplicationVO application) {
			
		if (application.getJoinFEP() == "true") {
			return true;
		} else {
			return false;
		}
				
	}
		
}
