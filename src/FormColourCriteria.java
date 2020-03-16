import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;

public class FormColourCriteria {

	private String formColour;
	
	public String getFormColour() {
		return formColour;
	}
	
	public void setFormColour(String formColour) {
		this.formColour = formColour;
	}
	
	public boolean met(MaintainApplicationVO application) {
		
		if (application.getApplicationFormColor() == formColour) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
