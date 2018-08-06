package coding.timeconversion;

public class TimeConversion implements TimeConversionI {

	@Override
	public String timeConversion(String s) {
		String arr[] = s.split(":");
		String hours = "";
		if (arr[0].equals("12") && arr[arr.length -1].endsWith("AM")) {
			hours = "00";
		} else if (arr[arr.length -1].endsWith("PM") && !arr[0].equals("12") ) {
			int h = Integer.parseInt(arr[0]);
			h += 12;
			hours = "" + h;
		} else {
			hours = arr[0];
		}
		String secs = arr[arr.length -1].substring(0,  2);
		String mins = arr[arr.length -2];
		return hours + ":" + mins + ":" + secs;
	}
	
}
