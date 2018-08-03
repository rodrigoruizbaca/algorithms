package coding.plusminus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PlusMinus implements PlusMinusI {

	@Override
	public double[] plusMinus(int[] arr) {
		int size = arr.length;
		final AtomicInteger pos = new AtomicInteger(0);
		final AtomicInteger neg = new AtomicInteger(0);
		final AtomicInteger zero = new AtomicInteger(0);
		Arrays.stream(arr).parallel().forEach(ele -> {
			if (ele > 0) {
				pos.incrementAndGet();
			} else if (ele < 0) {
				neg.incrementAndGet();
			} else {
				zero.incrementAndGet();
			}			
		});
		
		BigDecimal bpos = new BigDecimal(pos.get()).divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);
		BigDecimal bneg = new BigDecimal(neg.get()).divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);
		BigDecimal bzero = new BigDecimal(zero.get()).divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);
		
		return new double[] {bpos.doubleValue(), bneg.doubleValue(), bzero.doubleValue()};
	}

}
