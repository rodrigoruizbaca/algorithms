package coding.leftrotation;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeftRotationTest {
	
	LeftRotationI left = new LeftRotation();
	
	@Test
	public void test1() {
		
		int [] res = left.leftRotation(new int[] {1,2,3,4,5}, 2);
		assertArrayEquals(new int[] {3,4,5,1,2}, res);
	}
}
