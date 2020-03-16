import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		
		ruleListByVersionMap.entrySet().stream()
					        .filter(entry -> entry.getKey().equals(ruleVersion))
					        .map(entry -> entry.getValue())
					        .flatMap(List::stream)
					        .collect(Collectors.toList());
		
		return ruleListByRuleVersion;
	}
	
}
