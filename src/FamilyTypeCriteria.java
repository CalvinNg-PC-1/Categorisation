import java.util.List;
import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;

public class FamilyTypeCriteria {

	private static List<String> familyTypeList;
	
	public List<String> getFamilyTypeList() {
		return familyTypeList;
	}
	
	public void setFamilyTypeList(List<String> familyTypeList) {
		this.familyTypeList = familyTypeList;
	}

	public static boolean met(MaintainApplicationVO application) {
		
		boolean flag = false;
		
		if (familyTypeList.contains("N") == true || 
			familyTypeList.contains("F") == true || 
			familyTypeList.contains("S") == true) {
			flag = true;
		}
		
		return flag;
		
	}
	
}
