package coding.minmaxsum;

import java.math.BigInteger;

public class MinMaxSum implements MinMaxSumI {

	@Override
	public BigInteger[] miniMaxSum(int[] arr) {		
		BigInteger min = null;
		BigInteger max = null;
				
		for (int x = 0; x < arr.length; x++) {
			BigInteger sum = BigInteger.ZERO;
			for (int y = 0; y < arr.length; y++) {
				if (y != x) {
					sum = sum.add(BigInteger.valueOf(arr[y]));
				}			
			}
			if (min == null || sum.compareTo(min) < 0) {
				min = sum;
			}
			if (max == null || sum.compareTo(max) > 0) {
				max = sum;
			}
		}
		return new BigInteger[] {min, max};
		
	}

}
