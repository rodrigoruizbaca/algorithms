package coding.fibonacci;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	FibonacciI fib = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.fibonacci.Fibonacci");
		Constructor<?>[] constructors = clazz.getConstructors();
		fib = (FibonacciI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test() {
		
		int res = fib.fib(5);
		//0 1 1 2 3 = 5
		assertEquals(5, res);
	}
}
