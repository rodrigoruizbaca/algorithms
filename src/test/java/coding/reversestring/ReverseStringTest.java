package coding.reversestring;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
	
	ReverseStringI rev;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.reversestring.ReverseString");
		Constructor<?>[] constructors = clazz.getConstructors();
		rev = (ReverseStringI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {		
		assertEquals("dcba", rev.reverse("abcd"));
	}
	
	@Test
	public void test2() {
		assertEquals("dcba  ", rev.reverse("  abcd"));
	}
}
