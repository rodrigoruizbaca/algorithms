package coding.superdigit;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class SuperDigitTest {
	SuperDigitI instance;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.superdigit.SuperDigit");
		Constructor<?>[] constructors = clazz.getConstructors();
		instance = (SuperDigitI)
				constructors[0].newInstance();
	}

	
	@Test
	public void test1() {
		int resp = instance.superDigit("123", 3);
		assertEquals(9, resp);
	}
	
	@Test
	public void test2() {
		int resp = instance.superDigit("9875", 4);
		assertEquals(8, resp);
	}
	
	@Test
	public void test3() {
		int resp = instance.superDigit("9875", 4);
		assertEquals(8, resp);
	}
	
	@Test
	public void test4() {
		int resp = instance.superDigit("148", 3);
		assertEquals(3, resp);
	}
	
}
