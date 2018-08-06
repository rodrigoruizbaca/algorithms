package coding.commonlongest;

public class CommonLongest implements CommonLongestI {

	@Override
	public String getCommonLongest(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int[][] table = new int[arr1.length][arr2.length];
		String common = "";
		int max = 0;
		for (int x = 0; x < arr1.length; x++) {
			for (int y = 0; y < arr2.length; y++) {
				if (x == 0 || y == 0) {
					table[x][y] = 0;
				} else if (arr1[x-1] == arr2[y-1]) {
					table[x][y] = table[x-1][y-1] + 1;
					if (table[x][y] > max) {
						max = table[x][y];						
						common = s1.substring(x - max, x);
					}										
				} else {
					table[x][y] = 0;
				}
			}
		}		
		return common;
	}

}
