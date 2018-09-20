package coding.cakecandles;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class CakeCandlesTest {
	
	CakeCandlesI candle = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.cakecandles.CakeCandles");
		Constructor<?>[] constructors = clazz.getConstructors();
		candle = (CakeCandlesI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		int[] arr = new int[] {3, 2, 1, 3};
		int res = candle.birthdayCakeCandles(arr);
		assertEquals(2, res);
	}
}
