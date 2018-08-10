package coding.balanced;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BalancedTest {
	@Test
	public void test() {
		BalancedI bal = new Balanced();
		boolean resp = bal.isBalanaced("{[()]}");
		assertTrue(resp);
	}
}
