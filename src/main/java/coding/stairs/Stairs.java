package coding.stairs;

public class Stairs implements StairsI {

	@Override
	public String[] staircase(int n) {		
		String[] res = new String[n];
		for (int row = 0; row < n ; row++) {
			int piv = n - row;
			String stair = "";
			for (int col = 1; col <= n; col++) {
				if (col < piv) {
					stair += " ";
				} else {
					stair += "#";
				}				
			}
			res[row] = stair;
			stair = "";			
		}
		return res;
	}

}
