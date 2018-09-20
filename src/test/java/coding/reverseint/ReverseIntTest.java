package coding.reverseint;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class ReverseIntTest {
	
	ReverseIntI rev;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.reverseint.ReverseInt");
		Constructor<?>[] constructors = clazz.getConstructors();
		rev = (ReverseIntI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		assertEquals(0, rev.reverseInt(0));
	}
	
	@Test
	public void test2() {
		assertEquals(5, rev.reverseInt(5));
		assertEquals(51, rev.reverseInt(15));
		assertEquals(9, rev.reverseInt(90));
		assertEquals(9532, rev.reverseInt(2359));
	}
	
	@Test
	public void test3() {
		assertEquals(-5, rev.reverseInt(-5));
		assertEquals(-51, rev.reverseInt(-15));
		assertEquals(-9, rev.reverseInt(-90));
		assertEquals(-9532, rev.reverseInt(-2359));
	}
}
