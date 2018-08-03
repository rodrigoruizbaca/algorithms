package coding.maxchar;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxCharTest {
	MaxCharI maxChar = new MaxChar();
	
	@Test
	public void test1() {
		
		assertEquals('a', maxChar.maxChar("a"));
		assertEquals('a', maxChar.maxChar("abcdefghijklmnaaaaa"));
	}
	
	@Test
	public void test2() {
		assertEquals('1', maxChar.maxChar("ab1c1d1e1f1g1"));
	}
}
