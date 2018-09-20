package coding.reversestring;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
	
	ReverseStringI rev = new ReverseStringImpl();
	
	@Test
	public void test1() {		
		assertEquals("dcba", rev.reverse("abcd"));
	}
	
	@Test
	public void test2() {
		assertEquals("dcba  ", rev.reverse("  abcd"));
	}
}
