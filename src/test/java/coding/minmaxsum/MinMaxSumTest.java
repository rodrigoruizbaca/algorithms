package coding.minmaxsum;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigInteger;
public class MinMaxSumTest {
	MinMaxSumI minMax = new MinMaxSum();
	
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
