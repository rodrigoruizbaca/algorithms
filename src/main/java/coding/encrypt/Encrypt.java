package coding.encrypt;

public class Encrypt implements EncryptI {

	private char[][] helper(int len) {
		int x = (int)Math.sqrt(len);
		int y = x;
		while (x*y < len) {
			if (x < y) x++;
			else y++;
		}
		return new char[x][y];
	}
	
	@Override
	public String encryption(String s) {
		s = s.trim().replace(" ", "");				
		char[][] matrix = helper(s.length());
		int idx = 0;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				if (idx < s.length()) {
					matrix[x][y] = s.charAt(idx);
					idx++;
				} else {
					matrix[x][y] = ' ';
				}
			}
		}
		String enc = "";
		for (int y = 0; y < matrix[0].length; y++) {
			for (int x = 0; x < matrix.length; x++) {
				if (matrix[x][y] != ' ') {
					enc += matrix[x][y];
				}				
			}
			if (y < matrix[0].length-1)
				enc += " ";
		}
		return enc;
	}

}
