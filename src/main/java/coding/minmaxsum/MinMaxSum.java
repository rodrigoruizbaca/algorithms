package coding.minmaxsum;

public class MinMaxSum implements MinMaxSumI {

	@Override
	public long[] miniMaxSum(int[] arr) {		
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
				
		for (int x = 0; x < arr.length; x++) {
			int sum = 0;
			for (int y = 0; y < arr.length; y++) {
				if (y != x) {
					sum += arr[y];
				}			
			}
			if (sum < min) {
				min = sum;
			}
			if (sum > max) {
				max = sum;
			}
		}
		return new long[] {min, max};
		
	}

}
