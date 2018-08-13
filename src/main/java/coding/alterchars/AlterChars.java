package coding.alterchars;

public class AlterChars implements AlterCharsI {

	@Override
	public int alternatingCharacters(String s) {
		char[] arr = s.toCharArray();
		char last = arr[0];
		int num = 0;
		for (int x = 0; x < arr.length - 1; x++) {
			if (last == arr[x+1]) {
				num++;
			}
			last = arr[x+1];
		} 
		return num;
	}

}
