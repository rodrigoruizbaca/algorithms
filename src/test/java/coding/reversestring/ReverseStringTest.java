package coding.reversestring;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
	
	@Test
	public void test1() {
		ReverseStringI rev = new ReverseStringImpl();
		assertEquals("dcba", rev.reverse("abcd"));
	}
	
	@Test
	public void test2() {
		ReverseStringI rev = new ReverseStringImpl();
		assertEquals("dcba  ", rev.reverse("  abcd"));
	}
}
