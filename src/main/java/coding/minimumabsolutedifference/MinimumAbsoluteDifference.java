package coding.minimumabsolutedifference;

import java.util.Arrays;

public class MinimumAbsoluteDifference implements MinimumAbsoluteDifferenceI {

	@Override
	public int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int x = 0; x < arr.length -1 ; x++) {
			int temp = Math.abs(arr[x] - arr[x + 1]);
			if (temp < min) {
				min = temp;
			}				
		}
		return min;
	}

}
