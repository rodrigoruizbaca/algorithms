package coding.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping implements GroupingI {

	@Override
	public Map<Character, Long> getNumOfChars(String str) {		
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		return map;		
	}
		
	@Override
	public Map<Brand, Long> groupByType(List<Car> cars) {		
		Map<Brand, Long> map = cars.stream().collect(Collectors.groupingBy(Car::getBrand, Collectors.counting()));
		return map;		
	}
}
