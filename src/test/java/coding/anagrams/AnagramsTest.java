package coding.anagrams;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramsTest {
	
	@Test
	public void test1() {
		AnagramsI ana = new Anagrams();
		int resp = ana.makeAnagram("cde", "dcf");
		assertEquals(2, resp);
	}
	
	@Test
	public void test2() {
		AnagramsI ana = new Anagrams();
		int resp = ana.makeAnagram("cde", "abc");
		assertEquals(4, resp);
	}
	
	@Test
	public void test3() {
		AnagramsI ana = new Anagrams();
		int resp = ana.makeAnagram("showman", "woman");
		assertEquals(2, resp);
	}
	
	@Test
	public void test4() {
		AnagramsI ana = new Anagrams();
		int resp = ana.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		assertEquals(30, resp);
	}
	
	@Test
	public void test5() {
		AnagramsI ana = new Anagrams();
		int resp = ana.makeAnagram("abcwacc", "aabzcccc");
		assertEquals(3, resp);
	}
	
}
