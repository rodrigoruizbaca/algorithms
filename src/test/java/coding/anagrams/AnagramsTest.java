package coding.anagrams;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramsTest {
	
	AnagramsI ana = new Anagrams();
	
	@Test
	public void test1() {
		
		int resp = ana.makeAnagram("cde", "dcf");
		assertEquals(2, resp);
	}
	
	@Test
	public void test2() {

		int resp = ana.makeAnagram("cde", "abc");
		assertEquals(4, resp);
	}
	
	@Test
	public void test3() {

		int resp = ana.makeAnagram("showman", "woman");
		assertEquals(2, resp);
	}
	
	@Test
	public void test4() {

		int resp = ana.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		assertEquals(30, resp);
	}
	
	@Test
	public void test5() {

		int resp = ana.makeAnagram("abcwacc", "aabzcccc");
		assertEquals(3, resp);
	}
	
}
