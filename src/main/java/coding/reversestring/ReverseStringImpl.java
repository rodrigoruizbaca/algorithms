package coding.reversestring;

public class ReverseStringImpl implements ReverseStringI {

	public String reverse(String str) {		
		char[] arr = str.toCharArray();
		String reverse = "";
		for (int x = arr.length - 1; x >= 0; x--) {
			reverse += arr[x];
		}
		return reverse;
	}

}
