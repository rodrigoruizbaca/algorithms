package coding.minmaxsum;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;
public class MinMaxSumTest {
	MinMaxSumI minMax;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.minmaxsum.MinMaxSum");
		Constructor<?>[] constructors = clazz.getConstructors();
		minMax = (MinMaxSumI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		int[] arr = {1, 2, 3, 4, 5};
		BigInteger[] exp = {BigInteger.valueOf(10), BigInteger.valueOf(14)};
		BigInteger res[] = minMax.miniMaxSum(arr);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 3, 5, 7, 9};
		BigInteger[] exp = {BigInteger.valueOf(16), BigInteger.valueOf(24)};
		BigInteger res[] = minMax.miniMaxSum(arr);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
	}
	
	@Test
	public void test3() {
		int[] arr = {140638725, 436257910, 953274816, 734065819, 362748590};
		BigInteger[] exp = {BigInteger.valueOf(1673711044), new BigInteger("2486347135")};
		BigInteger res[] = minMax.miniMaxSum(arr);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
	}
}
