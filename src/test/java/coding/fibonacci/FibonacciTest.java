package coding.fibonacci;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
	
	FibonacciI fib = new Fibonacci();
	
	@Test
	public void test() {
		
		int res = fib.fib(5);
		//0 1 1 2 3 = 5
		assertEquals(5, res);
	}
}
