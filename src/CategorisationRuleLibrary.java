import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CategorisationRuleLibrary {
	
	private Map<String, List<CategorisationRule>> ruleListByVersionMap;
	private List<CategorisationRule> ruleListByRuleVersion;
	
	public Map<String, List<CategorisationRule>> getRuleListByVersionMap() {
		return ruleListByVersionMap;
	}
	
	public void setRuleListByVersionMap(Map<String, List<CategorisationRule>> ruleListByVersionMap) {
		this.ruleListByVersionMap = ruleListByVersionMap;
	}
	
	@Test
	public List<CategorisationRule> getRuleListByRuleVersion(String ruleVersion) {
		
		ruleListByVersionMap.entrySet().stream()
					        .filter(entry -> entry.getKey().equals(ruleVersion))
					        .map(entry -> entry.getValue())
					        .flatMap(List::stream)
					        .collect(Collectors.toList());
		
		return ruleListByRuleVersion;
	}
	
	@Test
	public void test() {
		fail("Category Rule Library Fail to Convert List!");
	}
	
}
