package coding.plusminus;

/**
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
 * store the decimal value of each fraction on a new element in the returned array.
 * For example, given the array [1,1,0,-1,-1] there are 5 elements, two positive, two negative and one zero. Their ratios would be
 * 	0.400000
	0.400000
	0.200000
 * @author rodrigo ruiz
 */
public interface PlusMinusI {
	double[] plusMinus(int[] arr);
}
