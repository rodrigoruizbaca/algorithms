package coding.cakecandles;
import static org.junit.Assert.*;
import org.junit.Test;

public class CakeCandlesTest {
	
	CakeCandlesI candle = new CakeCandles();
	
	@Test
	public void test1() {
		
		int[] arr = new int[] {3, 2, 1, 3};
		int res = candle.birthdayCakeCandles(arr);
		assertEquals(2, res);
	}
}
