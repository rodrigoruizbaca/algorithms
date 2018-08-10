package coding.fibonacci;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
	@Test
	public void test() {
		FibonacciI fib = new Fibonacci();
		int res = fib.fib(5);
		//0 1 1 2 3 = 5
		assertEquals(5, res);
	}
}
