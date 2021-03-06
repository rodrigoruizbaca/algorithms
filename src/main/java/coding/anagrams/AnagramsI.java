package coding.anagrams;
/**
 * Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character 
 * deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.
 * For example, if a=cde and b=dcf , we can delete e from string a and f from string b so that both remaining strings are cd and dc 
 * which are anagrams.
 * @author rodrigo ruiz
 *
 */
public interface AnagramsI {
	int makeAnagram(String a, String b);
}
