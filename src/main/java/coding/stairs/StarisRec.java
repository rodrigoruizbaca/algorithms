package coding.stairs;

public class StarisRec implements StairsI {

	@Override
	public String[] staircase(int n) {
		String[] res = new String[n];
		helper(n, 0, 1, "", res);
		return res;
	}

	private void helper(int n, int row, int col, String stair, String[] arr) {
		if (row < n) {
			int piv = n - row;
			if (col < piv) {
				stair += " ";
			} else {
				stair += "#";
			}
			if (col < n) {
				col++;
				helper(n, row, col, stair, arr);
			} else {
				arr[row] = stair;
				row++;
				helper(n, row, 1, "", arr);
			}
		}		
	}
}
