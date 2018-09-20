package coding.anagrams;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class AnagramsTest {
	
	AnagramsI ana = null;
	
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.anagrams.Anagrams");
		Constructor<?>[] constructors = clazz.getConstructors();
		ana = (AnagramsI)
				constructors[0].newInstance();
	}
	
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
