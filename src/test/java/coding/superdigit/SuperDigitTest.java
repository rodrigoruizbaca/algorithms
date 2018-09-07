package coding.superdigit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SuperDigitTest {
	SuperDigitI instance;
	
	@Before
	public void init() {
		instance = new SuperDigit();
	}
	
	@Test
	public void test1() {
		int resp = instance.superDigit("123", 3);
		assertEquals(9, resp);
	}
	
	@Test
	public void test2() {
		int resp = instance.superDigit("9875", 4);
		assertEquals(8, resp);
	}
	
	@Test
	public void test3() {
		int resp = instance.superDigit("9875", 4);
		assertEquals(8, resp);
	}
	
	@Test
	public void test4() {
		int resp = instance.superDigit("148", 3);
		assertEquals(3, resp);
	}
	
}
