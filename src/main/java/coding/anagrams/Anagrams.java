package coding.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Anagrams implements AnagramsI {

	@Override
	public int makeAnagram(String a, String b) {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		for (char c: a.toCharArray()) {
			map1.merge(c, 1, (oldVal, newVal) -> ++oldVal);			
		}
		
		for (char c: b.toCharArray()) {
			map2.merge(c, 1, (oldVal, newVal) -> ++oldVal);	
		}
		
		final AtomicInteger numOfDels = new AtomicInteger();
	
		map1.keySet().stream().forEach(key -> {
			if (map2.containsKey(key)) {
				int delta = Math.abs(map2.get(key) - map1.get(key));
				if (delta > 0) {
					numOfDels.addAndGet(delta);
					map2.put(key, map1.get(key));
				}
			} else {
				numOfDels.addAndGet(map1.get(key));
			}
		});
		
		map2.keySet().stream().forEach(key -> {
			if (map1.containsKey(key)) {
				int delta = Math.abs(map2.get(key) - map1.get(key));
				if (delta > 0) {
					numOfDels.addAndGet(delta);
				}
			} else {
				numOfDels.addAndGet(map2.get(key));
			}
		});
		
		return numOfDels.get();
	}

}
