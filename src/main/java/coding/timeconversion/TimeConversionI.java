package coding.timeconversion;
/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * 07:05:45PM -> 19:05:45
 * @author rodrigo ruiz
 *
 */
public interface TimeConversionI {
	String timeConversion(String s);
}
