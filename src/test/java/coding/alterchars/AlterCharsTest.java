package coding.alterchars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlterCharsTest {
	@Test
	public void test1() {
		AlterCharsI alter = new AlterChars();
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
		AlterCharsI alter = new AlterChars();
		int resp = alter.alternatingCharacters("AAABBBAABB");
		assertEquals(6, resp);
		resp = alter.alternatingCharacters("AABBAABB");
		assertEquals(4, resp);
		resp = alter.alternatingCharacters("ABABABAA");
		assertEquals(1, resp);

	}
	
	@Test
	public void test3() {
		AlterCharsI alter = new AlterChars();
		int resp = alter.alternatingCharacters("ABBABBAA");
		assertEquals(3, resp);
	}
}
