package coding.superdigit;
/**
 * We define super digit of an integer x using the following rules:
 * Given an integer, we need to find the super digit of the integer.
 * If x has only 1 digit, then its super digit is x.
 * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
 * Example: 9875
 * superDigit(9875) = 9+8+7+5 = 29
 * superDigit(29) = 9+2 = 11
 * superDigit(11) = 2
 * super digit = 2
 * You are given two numbers n and k. The number p is created by concatenating the string n k times. 
 * Continuing the above example where n = 9875, assume your value k = 4. Your initial p= 9875 9875 9875 9875 (spaces added for clarity).
 * Calculate the super digit of p
 * @author rodrigo ruiz
 *
 */
public interface SuperDigitI {
	int superDigit(String n, int k);
}
