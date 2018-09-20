package coding.balanced;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BalancedTest {
	
	BalancedI bal = new Balanced();
	
	@Test
	public void test() {
		
		boolean resp = bal.isBalanaced("{[()]}");
		assertTrue(resp);
	}
}
