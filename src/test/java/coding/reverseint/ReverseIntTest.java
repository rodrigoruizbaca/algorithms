package coding.reverseint;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntTest {
	
	ReverseIntI rev = new ReverseInt();;
	
	@Test
	public void test1() {
		
		assertEquals(0, rev.reverseInt(0));
	}
	
	@Test
	public void test2() {
		assertEquals(5, rev.reverseInt(5));
		assertEquals(51, rev.reverseInt(15));
		assertEquals(9, rev.reverseInt(90));
		assertEquals(9532, rev.reverseInt(2359));
	}
	
	@Test
	public void test3() {
		assertEquals(-5, rev.reverseInt(-5));
		assertEquals(-51, rev.reverseInt(-15));
		assertEquals(-9, rev.reverseInt(-90));
		assertEquals(-9532, rev.reverseInt(-2359));
	}
}
