package coding.reverseint;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntTest {
	
	@Test
	public void test1() {
		ReverseIntI rev = new ReverseInt();;
		assertEquals(0, rev.reverseInt(0));
	}
	
	@Test
	public void test2() {
		ReverseIntI rev = new ReverseInt();;
		assertEquals(5, rev.reverseInt(5));
		assertEquals(51, rev.reverseInt(15));
		assertEquals(9, rev.reverseInt(90));
		assertEquals(9532, rev.reverseInt(2359));
	}
	
	@Test
	public void test3() {
		ReverseIntI rev = new ReverseInt();
		assertEquals(-5, rev.reverseInt(-5));
		assertEquals(-51, rev.reverseInt(-15));
		assertEquals(-9, rev.reverseInt(-90));
		assertEquals(-9532, rev.reverseInt(-2359));
	}
}
