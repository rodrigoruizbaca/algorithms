package coding.specialpalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPalindromeTest {
	@Test
	public void test1() {
		SpecialPalindromeI special = new SpecialPalindrome();
		long resp = special.substrCount("asasd");
		assertEquals(7, resp);
	}
	
	@Test
	public void test2() {
		SpecialPalindromeI special = new SpecialPalindrome();
		long resp = special.substrCount("abcbaba");
		assertEquals(10, resp);
	}
	
	@Test
	public void test3() {
		SpecialPalindromeI special = new SpecialPalindrome();
		long resp = special.substrCount("aaaa");
		assertEquals(10, resp);
	}
	
}
