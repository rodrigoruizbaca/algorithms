package coding.reverseint;

import coding.reversestring.ReverseStringI;
import coding.reversestring.ReverseStringImpl;

public class ReverseInt implements ReverseIntI {

	public int reverseInt(int n) {
		int sign = getSign(n);
		String str = Integer.toString(n);
		if (str.startsWith("-")) {
			str = str.substring(1);
		}
		ReverseStringI reverseStr = new ReverseStringImpl();
		String reverse = reverseStr.reverse(str);		
		return Integer.parseInt(reverse) * sign;
	}

	private int getSign(int n) {
		return n >= 0 ? 1 : -1;
	}
}
