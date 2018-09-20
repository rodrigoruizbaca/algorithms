package coding.stairs;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
public class StairsTest {
	StairsI stairs;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.stairs.StarisRec");
		Constructor<?>[] constructors = clazz.getConstructors();
		stairs = (StairsI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		String exp[] = new String[] {"  #", " ##", "###"};
		String res[] = stairs.staircase(3);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
		assertEquals(exp[2], res[2]);
	}
	
	@Test
	public void test2() {
		String exp[] = new String[] {"     #","    ##","   ###","  ####"," #####","######"};
		String res[] = stairs.staircase(6);
		assertEquals(exp[0], res[0]);
		assertEquals(exp[1], res[1]);
		assertEquals(exp[2], res[2]);
		assertEquals(exp[3], res[3]);
		assertEquals(exp[4], res[4]);
		assertEquals(exp[5], res[5]);
	}
}


//[     #,     ##,    ###,   ####,  #####, ######]