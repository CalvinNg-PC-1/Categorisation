import java.util.List;

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

	//public boolean allCriteriasMet(MaintainApplicationVO application) {
		
	//}
	
}
