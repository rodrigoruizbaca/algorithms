package coding.encrypt;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
public class EncryptTest {
	
	EncryptI encrypt = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.encrypt.Encrypt");
		Constructor<?>[] constructors = clazz.getConstructors();
		encrypt = (EncryptI)
				constructors[0].newInstance();
	}
	
	@Test()
	public void test1() {
		
		String res = encrypt.encryption("chillout");
		assertEquals("clu hlt io", res);
	}
	
	@Test
	public void test2() {
		
		String res = encrypt.encryption("haveaniceday");
		assertEquals("hae and via ecy", res);
	}
	
	@Test
	public void test3() {
		String res = encrypt.encryption("feedthedog");
		assertEquals("fto ehg ee dd", res);
	}
	
	@Test
	public void test4() {
		
		String res = encrypt.encryption("iffactsdontfittotheorychangethefacts");
		assertEquals("isieae fdtonf fotrga anoyec cttctt tfhhhs", res);
	}
}
