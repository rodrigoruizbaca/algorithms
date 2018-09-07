package coding.superdigit;

public class SuperDigit implements SuperDigitI {

	@Override
	public int superDigit(String n, int k) {				
		String result = helper(n);		
		String  p = convertNum(result, k);
		result = helper(p);
		return Integer.parseInt(result);
	}

	private String helper(String num) {
		if (num.length() <= 1) {
			return num;
		}
		return helper(Integer.toString(num.chars().parallel().map(c -> c-'0').sum()));
	}
	
	private String convertNum(String n, int k) {
		String str = "";
		for (int x = 0; x < k; x++) {
			str += n;
		}
		return str;
	}
}