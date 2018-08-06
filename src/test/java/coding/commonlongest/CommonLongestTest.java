package coding.commonlongest;
import org.junit.Test;
import static org.junit.Assert.*;
public class CommonLongestTest {
	@Test
	public void test1() {
		CommonLongestI common = new CommonLongest();
		String s1 = "OldSite:GeeksforGeeks.org";
        String s2 = "NewSite:GeeksQuiz.com";
        String res = common.getCommonLongest(s1, s2);
        assertEquals(10, res.length());
        assertEquals("Site:Geeks", res);
	}
	
	@Test
	public void test2() {
		CommonLongestI common = new CommonLongest();
		String s1 = "hola";
        String s2 = "holi";
        String res = common.getCommonLongest(s1, s2);
        assertEquals(3, res.length());
        assertEquals("hol", res);
	}
	
	@Test
	public void test3() {
		CommonLongestI common = new CommonLongest();
        String res = common.getCommonLongestSubstr("banana");
        assertEquals("na", res);
        
        res = common.getCommonLongestSubstr("banaana");
        assertEquals("ana", res);
 
	}
}
