package coding.divideandconquer;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class DivideAndConquerTest {
	
	DivideAndConquerI divide = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.divideandconquer.DivideAndConquer");
		Constructor<?>[] constructors = clazz.getConstructors();
		divide = (DivideAndConquerI)
				constructors[0].newInstance();
	}
	
	@Test
	public void testBinarySearch() {
		int[] arr = new int[] {1,2,3,4,5,6};
		
		for (int k: arr) {
			int resp = divide.binarySerach(arr, k);
			assertEquals(k, resp);
		}
		
		int resp = divide.binarySerach(arr, 10);
		assertEquals(-1, resp);
	}
	
	@Test
	public void testSum() {
		int[] arr = new int[] {1,2,3,4,5,6};				
		int resp = divide.sum(arr);
		assertEquals(21, resp);
	}
	
	
}
