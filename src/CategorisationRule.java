import java.util.List;
import hk.gov.housingauthority.nhs.common.vo.maintainApplication.MaintainApplicationVO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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

	@Test
	public boolean allCriteriasMet(MaintainApplicationVO application) {
		
		boolean flag = false;
		
		// All Criteria met
		if (Criteria.met(application) == true && 
			FamilyTypeCriteria.met(application) == true && 
			FormColourCriteria.met(application) == true && 
			JoinFepCriteria.met(application) == true) {
			flag = true;
		}
		
		return flag;
	}
	
	@Test
	public void test() {
		fail("Category Rule Fail!");
	}
	
}
