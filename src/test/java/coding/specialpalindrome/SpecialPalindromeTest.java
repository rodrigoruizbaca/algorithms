package coding.specialpalindrome;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class SpecialPalindromeTest {
	
	SpecialPalindromeI special;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.specialpalindrome.SpecialPalindrome");
		Constructor<?>[] constructors = clazz.getConstructors();
		special = (SpecialPalindromeI)
				constructors[0].newInstance();
	}
	
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
