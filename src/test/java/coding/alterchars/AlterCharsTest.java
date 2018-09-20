package coding.alterchars;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class AlterCharsTest {
	
	AlterCharsI alter = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.alterchars.AlterChars");
		Constructor<?>[] constructors = clazz.getConstructors();
		alter = (AlterCharsI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		int resp = alter.alternatingCharacters("AAAA");
		assertEquals(3, resp);
		resp = alter.alternatingCharacters("BBBBB");
		assertEquals(4, resp);
		resp = alter.alternatingCharacters("ABABABAB");
		assertEquals(0, resp);
		resp = alter.alternatingCharacters("BABABA");
		assertEquals(0, resp);
		resp = alter.alternatingCharacters("AAABBB");
		assertEquals(4, resp);
	}
	
	@Test
	public void test2() {
		
		int resp = alter.alternatingCharacters("AAABBBAABB");
		assertEquals(6, resp);
		resp = alter.alternatingCharacters("AABBAABB");
		assertEquals(4, resp);
		resp = alter.alternatingCharacters("ABABABAA");
		assertEquals(1, resp);

	}
	
	@Test
	public void test3() {
		
		int resp = alter.alternatingCharacters("ABBABBAA");
		assertEquals(3, resp);
	}
}
