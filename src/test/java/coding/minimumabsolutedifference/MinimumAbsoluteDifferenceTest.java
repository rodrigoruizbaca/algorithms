package coding.minimumabsolutedifference;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinimumAbsoluteDifferenceTest {
	
	MinimumAbsoluteDifferenceI instance;
	
	@Before
	public void init() {
		instance = new MinimumAbsoluteDifference();
	}
	
	@Test
	public void test1() {
		int resp = instance.minimumAbsoluteDifference(new int[] {-2,2,4});
		assertEquals(2, resp);
	}
	
	@Test
	public void test2() {
		int resp = instance.minimumAbsoluteDifference(new int[] {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
		assertEquals(1, resp);
	}
	
	@Test
	public void test3() {
		int resp = instance.minimumAbsoluteDifference(new int[] {3, -7, 0});
		assertEquals(3, resp);
	}
	
	@Test
	public void test4() {
		int resp = instance.minimumAbsoluteDifference(new int[] {1, -3, 71, 68, 17});
		assertEquals(3, resp);
	}
}
