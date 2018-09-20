package coding.timeconversion;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class TimeConversionTest {
	
	TimeConversionI time;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.timeconversion.TimeConversion");
		Constructor<?>[] constructors = clazz.getConstructors();
		time = (TimeConversionI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {			
		String res = time.timeConversion("07:05:45PM");
		assertEquals("19:05:45", res);
	}
	
	@Test
	public void test2() {
		String res = time.timeConversion("07:05:45AM");
		assertEquals("07:05:45", res);
	}
}
