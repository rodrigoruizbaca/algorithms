package coding.factorial;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	
	FactorialI fact = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.factorial.Factorial");
		Constructor<?>[] constructors = clazz.getConstructors();
		fact = (FactorialI)
				constructors[0].newInstance();
	}
	
	
	@Test
	public void testRec() {
		
		int res = fact.factorial(5);
		assertEquals(120, res);
	}
	
	@Test
	public void testIte() {
		FactorialI fact = new FactorialIterative();
		int res = fact.factorial(5);
		assertEquals(120, res);
	}
}
