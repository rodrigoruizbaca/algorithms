package coding.validstring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidStringTest {
	@Test
	public void test1() {
		ValidStringI valid = new ValidString();
		boolean resp = valid.isValid("aabbcd");
		assertEquals(false, resp);
	}
	
	@Test
	public void test2() {
		ValidStringI valid = new ValidString();
		boolean resp = valid.isValid("aabbccddeefghi");
		assertEquals(false, resp);
	}
	
	@Test
	public void test3() {
		ValidStringI valid = new ValidString();
		boolean resp = valid.isValid("abcdefghhgfedecba");
		assertEquals(true, resp);
	}
	
	@Test
	public void test4() {
		ValidStringI valid = new ValidString();
		boolean resp = valid.isValid("aabbc");
		assertEquals(true, resp);
	}
}
