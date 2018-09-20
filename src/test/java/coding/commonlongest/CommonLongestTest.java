package coding.commonlongest;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
public class CommonLongestTest {
	
	CommonLongestI common = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.commonlongest.CommonLongest");
		Constructor<?>[] constructors = clazz.getConstructors();
		common = (CommonLongestI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		String s1 = "OldSite:GeeksforGeeks.org";
        String s2 = "NewSite:GeeksQuiz.com";
        String res = common.getCommonLongest(s1, s2);
        assertEquals(10, res.length());
        assertEquals("Site:Geeks", res);
	}
	
	@Test
	public void test2() {
		
		String s1 = "hola";
        String s2 = "holi";
        String res = common.getCommonLongest(s1, s2);
        assertEquals(3, res.length());
        assertEquals("hol", res);
	}
	
	@Test
	public void test3() {
		
        String res = common.getCommonLongestSubstr("banana");
        assertEquals("na", res);
        
        res = common.getCommonLongestSubstr("banaana");
        assertEquals("ana", res);
 
	}
}
