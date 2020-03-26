import java.util.List;
import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FamilyTypeCriteria {

	private static List<String> familyTypeList;
	
	public List<String> getFamilyTypeList() {
		return familyTypeList;
	}
	
	public void setFamilyTypeList(List<String> familyTypeList) {
		this.familyTypeList = familyTypeList;
	}
	
	@Test
	public static boolean met(MaintainApplicationVO application) {
		
		boolean flag = false;
		
		if (familyTypeList.contains("N") == true || 
			familyTypeList.contains("F") == true || 
			familyTypeList.contains("S") == true) {
			flag = true;
		}
		
		return flag;
		
	}
	
	@Test
	public void test() {
		fail("Family Type Criteria Fail!");
	}
	
}
