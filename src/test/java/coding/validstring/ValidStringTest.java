package coding.validstring;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class ValidStringTest {
	
	ValidStringI valid;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.validstring.ValidString");
		Constructor<?>[] constructors = clazz.getConstructors();
		valid = (ValidStringI)
				constructors[0].newInstance();
	}
	
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
