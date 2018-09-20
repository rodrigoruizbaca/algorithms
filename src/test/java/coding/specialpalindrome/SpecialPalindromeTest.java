package coding.specialpalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPalindromeTest {
	
	SpecialPalindromeI special = new SpecialPalindrome();
	
	@Test
	public void test1() {
		
		long resp = special.substrCount("asasd");
		assertEquals(7, resp);
	}
	
	@Test
	public void test2() {
		long resp = special.substrCount("abcbaba");
		assertEquals(10, resp);
	}
	
	@Test
	public void test3() {
		long resp = special.substrCount("aaaa");
		assertEquals(10, resp);
	}
	
}
