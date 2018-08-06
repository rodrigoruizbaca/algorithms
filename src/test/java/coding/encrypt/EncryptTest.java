package coding.encrypt;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class EncryptTest {
	
	//@Test()
	public void test1() {
		EncryptI encrypt = new Encrypt();
		String res = encrypt.encryption("chillout");
		assertEquals("clu hlt io", res);
	}
	
	//@Test
	public void test2() {
		EncryptI encrypt = new Encrypt();
		String res = encrypt.encryption("haveaniceday");
		assertEquals("hae and via ecy", res);
	}
	
	//@Test
	public void test3() {
		EncryptI encrypt = new Encrypt();
		String res = encrypt.encryption("feedthedog");
		assertEquals("fto ehg ee dd", res);
	}
	
	@Test
	public void test4() {
		EncryptI encrypt = new Encrypt();
		String res = encrypt.encryption("iffactsdontfittotheorychangethefacts");
		assertEquals("isieae fdtonf fotrga anoyec cttctt tfhhhs", res);
	}
}
