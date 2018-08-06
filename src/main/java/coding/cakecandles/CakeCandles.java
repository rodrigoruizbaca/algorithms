package coding.cakecandles;

import java.util.Arrays;

public class CakeCandles implements CakeCandlesI {

	@Override
	public int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int max = ar[ar.length -1];
		int cont = 0;
		for (int ele: ar) {
			if (ele == max) cont++;
		}
		return cont;
	}		

}
