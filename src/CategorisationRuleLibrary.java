import java.util.List;
import java.util.Map;

public class CategorisationRuleLibrary {
	
	private Map<String, List<CategorisationRule>> ruleListByVersionMap;
	private List<CategorisationRule> ruleListByRuleVersion;
	
	public Map<String, List<CategorisationRule>> getRuleListByVersionMap() {
		return ruleListByVersionMap;
	}
	
	public void setRuleListByVersionMap(Map<String, List<CategorisationRule>> ruleListByVersionMap) {
		this.ruleListByVersionMap = ruleListByVersionMap;
	}
	
	public List<CategorisationRule> getRuleListByRuleVersion(String ruleVersion) {
		
		// Some jobs doing with ruleVersion
		
		// this method to be implemented, to get the rule version from database
        //String ruleVersion = XXXService.getCategorisationRuleVersion(application.getPhaseCode); 

        //List<CategorisationRule> categorisationRuleList = categorisationRuleLibrary.getRuleListByRuleVersion(ruleVersion);

        //for 

        // Do something to update the priorityInfo on the application object

		
		
		return ruleListByRuleVersion;
	}
	
}
