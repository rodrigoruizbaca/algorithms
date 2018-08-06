package timeconversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coding.timeconversion.TimeConversion;
import coding.timeconversion.TimeConversionI;

public class TimeConversionTest {
	@Test
	public void test1() {
		TimeConversionI time = new TimeConversion();		
		String res = time.timeConversion("07:05:45PM");
		assertEquals("19:05:45", res);
	}
	
	@Test
	public void test2() {
		TimeConversionI time = new TimeConversion();		
		String res = time.timeConversion("07:05:45AM");
		assertEquals("07:05:45", res);
	}
}
