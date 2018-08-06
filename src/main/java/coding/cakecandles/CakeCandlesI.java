package coding.cakecandles;
/**
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. 
 * When she blows out the candles, she’ll only be able to blow out the tallest ones. 
 * Your task is to find out how many candles she can successfully blow out.
 * For example, if your niece is turning  years old, and the cake will have  candles of height 3, 2, 1, 3, 
 * she will be able to blow out 2 candles successfully, since the tallest candle is of height 3 and there are 2 such candles.
 * @author rodrigo ruiz
 *
 */
public interface CakeCandlesI {
	public int birthdayCakeCandles(int[] ar);
}
