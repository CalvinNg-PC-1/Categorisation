import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FormColourCriteria {

	private static String formColour;
	
	public String getFormColour() {
		return formColour;
	}
	
	public void setFormColour(String formColour) {
		this.formColour = formColour;
	}
	
	@Test
	public static boolean met(MaintainApplicationVO application) {
		
		if (application.getApplicationFormColor() == formColour) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Test
	public void test() {
		fail("Form Colour Criteria Fail!");
	}
	
}
