package coding.factorial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
	
	FactorialI fact = new Factorial();
	
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
