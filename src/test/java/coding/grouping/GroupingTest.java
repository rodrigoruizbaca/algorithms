package coding.grouping;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GroupingTest {
	GroupingI grouping = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.grouping.Grouping");
		Constructor<?>[] constructors = clazz.getConstructors();
		grouping = (GroupingI)
				constructors[0].newInstance();
	}
	
	@Test
	public void testGrouping1() {
		String str = "rodrigo";
		Map<Character, Long> map = grouping.getNumOfChars(str);
		long resp = map.get('r');
		assertEquals(2, resp);
	}
	
	@Test
	public void testGrouping2() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(Brand.FORD));
		cars.add(new Car(Brand.FORD));
		cars.add(new Car(Brand.FORD));
		cars.add(new Car(Brand.HONDA));
		cars.add(new Car(Brand.NISSAN));
		cars.add(new Car(Brand.NISSAN));
		Map<Brand, Long> map = grouping.groupByType(cars);
		long resp = map.get(Brand.FORD);
		assertEquals(3, resp);
		
		resp = map.get(Brand.HONDA);
		assertEquals(1, resp);
		
		resp = map.get(Brand.NISSAN);
		assertEquals(2, resp);
	}
}
