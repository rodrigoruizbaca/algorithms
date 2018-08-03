package coding.minmaxsum;
import org.junit.Test;
import static org.junit.Assert.*;
public class MinMaxSumTest {
	MinMaxSumI minMax = new MinMaxSum();
	
	@Test
	public void test1() {
		int[] arr = {1, 2, 3, 4, 5};
		long[] exp = {10, 14};
		long res[] = minMax.miniMaxSum(arr);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 3, 5, 7, 9};
		long[] exp = {16, 24};
		long res[] = minMax.miniMaxSum(arr);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
	}
}
