package coding.validstring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidStringTest {
	
	ValidStringI valid = new ValidString();
	
	@Test
	public void test1() {
		
		boolean resp = valid.isValid("aabbcd");
		assertEquals(false, resp);
	}
	
	@Test
	public void test2() {
		
		boolean resp = valid.isValid("aabbccddeefghi");
		assertEquals(false, resp);
	}
	
	@Test
	public void test3() {
		
		boolean resp = valid.isValid("abcdefghhgfedecba");
		assertEquals(true, resp);
	}
	
	@Test
	public void test4() {
		
		boolean resp = valid.isValid("aabbc");
		assertEquals(true, resp);
	}
}
