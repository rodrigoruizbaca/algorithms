package coding.grouping;

import java.util.List;
import java.util.Map;

public interface GroupingI {
	public Map<Character, Long> getNumOfChars(String str);
	
	public Map<Brand, Long> groupByType(List<Car> cars);
}
