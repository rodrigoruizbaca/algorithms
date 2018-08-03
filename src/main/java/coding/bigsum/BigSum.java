package coding.bigsum;

import java.util.Arrays;

public class BigSum implements BigSumI {
	public long bigSum(long[] l) {
		return Arrays.stream(l).parallel().reduce((acum, val) -> acum = acum + val).getAsLong();
	}
}
