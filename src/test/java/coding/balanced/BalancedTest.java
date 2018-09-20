package coding.balanced;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class BalancedTest {
	
	BalancedI bal = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.balanced.Balanced");
		Constructor<?>[] constructors = clazz.getConstructors();
		bal = (BalancedI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test() {
		
		boolean resp = bal.isBalanaced("{[()]}");
		assertTrue(resp);
	}
}
