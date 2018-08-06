package coding.encrypt;
/**
 * An English text needs to be encrypted using the following encryption scheme. 
 * First, the spaces are removed from the text. Let L be the length of this text. 
 * Then, characters are written into a grid, whose rows and columns have the following constraints:
 * For example, the sentence "have a nice day", after removing spaces is 12 characters long. the root square of 12 is 3.46
 * Means between 3 and 4, so it is written in the form of a grid with 3 rows and 4 cols.
 *  
 *  have
 *  anic
 *  eday
 *  
 *  The encoded message is obtained by displaying the characters in a column, inserting a space, 
 *  and then displaying the next column and inserting a space, and so on. 
 *  For example, the encoded message for the above rectangle is: hae and via ecy
 * @author rodrigo ruiz
 *
 */
public interface EncryptI {
	String encryption(String s);
}
