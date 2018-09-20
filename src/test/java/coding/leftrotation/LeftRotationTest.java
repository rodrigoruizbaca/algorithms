package coding.leftrotation;

import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class LeftRotationTest {
	
	LeftRotationI left = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.leftrotation.LeftRotation");
		Constructor<?>[] constructors = clazz.getConstructors();
		left = (LeftRotationI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		int [] res = left.leftRotation(new int[] {1,2,3,4,5}, 2);
		assertArrayEquals(new int[] {3,4,5,1,2}, res);
	}
}
