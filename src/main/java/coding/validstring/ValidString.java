package coding.validstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidString implements ValidStringI {

	@Override
	public boolean isValid(String s) {
		if (s.trim().isEmpty()) return true;
		s = s.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c: s.toCharArray()) {
			map.merge(c, 1, (oldValue, newVal) -> ++oldValue);
		}			
		
		List<Integer> nums = new ArrayList<>(map.values());
		int numDels = 0;
		
		for (int x = 0, y = nums.size() -1; x < y; x++, y--) {
			if (nums.get(x) != nums.get(y)) {
				numDels += Math.abs(nums.get(x) - nums.get(y));
			}
			if (numDels > 1) return false;
		}		
		return true;
	}

}
