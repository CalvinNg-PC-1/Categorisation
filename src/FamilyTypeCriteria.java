import java.util.List;

import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;

public class FamilyTypeCriteria {

	private List<String> familyTypeList;
	
	public List<String> getFamilyTypeList() {
		return familyTypeList;
	}
	
	public void setFamilyTypeList(List<String> familyTypeList) {
		this.familyTypeList = familyTypeList;
	}

	public boolean met(MaintainApplicationVO application) {
	
		return true;
		
	}
	
}
