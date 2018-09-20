package timeconversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coding.timeconversion.TimeConversion;
import coding.timeconversion.TimeConversionI;

public class TimeConversionTest {
	
	TimeConversionI time = new TimeConversion();	
	
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
