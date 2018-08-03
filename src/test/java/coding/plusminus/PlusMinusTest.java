package coding.plusminus;

import org.junit.Test;
import static org.junit.Assert.*;
public class PlusMinusTest {
	PlusMinusI plusMinus = new PlusMinus();
	
	@Test
	public void test1() {
		int[] arr = new int[] {1,1,0,-1,-1};
		double res[] = plusMinus.plusMinus(arr);
		double exp[] = new double[] {0.400000, 0.400000, 0.200000};
		assertEquals(new Double(exp[0]), new Double(res[0]));
		assertEquals(new Double(exp[1]), new Double(res[1]));
		assertEquals(new Double(exp[2]), new Double(res[2]));
	}
	
	@Test
	public void test2() {
		int[] arr = new int[] {-4, 3, -9, 0, 4, 1};
		double res[] = plusMinus.plusMinus(arr);
		double exp[] = new double[] {0.500000, 0.333333, 0.166667};
		assertEquals(new Double(exp[0]), new Double(res[0]));
		assertEquals(new Double(exp[1]), new Double(res[1]));
		assertEquals(new Double(exp[2]), new Double(res[2]));
	}
}
