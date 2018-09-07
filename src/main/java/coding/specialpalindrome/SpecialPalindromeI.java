package coding.specialpalindrome;
/**
 * A string is said to be a special palindromic string if either of two conditions is met:
 * All of the characters are the same, e.g. aaa.
 * All characters except the middle one are the same, e.g. aadaa.
 * A special palindromic substring is any substring of a string which meets one of those criteria. 
 * Given a string, determine how many special palindromic substrings can be formed from it.
 * For example, given the string s=mnonopoo, we have the following special palindromic substrings:
 * {m, n, o, n, o, p, o, o, non, ono, opo, oo}
 * Implement the substrCount function in the editor below. 
 * It should return an integer representing the number of special palindromic substrings that can be formed from the given string.
 * @author rodrigo ruiz
 *
 */
public interface SpecialPalindromeI {
	long substrCount(String s);
}
