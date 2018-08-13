package coding.maxchar;

import java.util.HashMap;
import java.util.Map;

public class MaxChar implements MaxCharI {

	public char maxChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c: str.toCharArray()) {
			map.merge(c, 1, (existingVal, newVal) -> ++existingVal);
			
		}
		int max = 0;
		Character maxChar = null;
		for (char key: map.keySet()) {
			if (map.get(key) > max) {
				maxChar = key;
				max = map.get(key);
			}
		}		
		return maxChar;		
	}

}
