package coding.specialpalindrome;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SpecialPalindrome implements SpecialPalindromeI {

	@Override
	public long substrCount(String s) {
		AtomicInteger idx = new AtomicInteger(s.length() + 1);
		ExecutorService executor = Executors.newCachedThreadPool();	
		AtomicInteger num = new AtomicInteger(0);
		for (int y = 0; y < s.length()+1; y++) {			
			executor.execute(() -> {
				int currentIdx = idx.decrementAndGet();				
				for (int x = 0; x < currentIdx; x++) {										
					String subs = s.substring(x, currentIdx);
					if (sameCharacters(subs)) {
						System.out.println(subs);
						num.incrementAndGet();
					}
				}
			});			
		}
		executor.shutdown();		
		while (!executor.isTerminated());
		
		
		return num.get();
	}

	
	private boolean sameCharacters(String s) {
		int middle = s.length() / 2;
		boolean odd = s.length() % 2 != 0;
		char c = s.charAt(0);
		for (int x = 1; x < s.length(); x++) {
			if (odd) {
				if (x == middle) {
					x++;
				}
				if (c != s.charAt(x)) {
					return false;
				}
			} else {
				if (c != s.charAt(x)) {
					return false;
				}
			}
			
			c = s.charAt(x);
		}
		return true;
	}
	
	@SuppressWarnings("unused")
	private char[] reverse(char[] array) {
		for(int i=0; i<array.length/2; i++) { 
			char temp = array[i]; 
			array[i] = array[array.length -i -1]; 
			array[array.length -i -1] = temp; 
		}
		return array;
	}

}
