package coding.maxchar;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class MaxCharTest {
	MaxCharI maxChar = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.maxchar.MaxChar");
		Constructor<?>[] constructors = clazz.getConstructors();
		maxChar = (MaxCharI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		assertEquals('a', maxChar.maxChar("a"));
		assertEquals('a', maxChar.maxChar("abcdefghijklmnaaaaa"));
	}
	
	@Test
	public void test2() {
		assertEquals('1', maxChar.maxChar("ab1c1d1e1f1g1"));
	}
}
