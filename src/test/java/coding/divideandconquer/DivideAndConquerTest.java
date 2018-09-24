package coding.divideandconquer;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class DivideAndConquerTest {
	
	DivideAndConquerI divide = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.divideandconquer.DivideAndConquer");
		Constructor<?>[] constructors = clazz.getConstructors();
		divide = (DivideAndConquerI)
				constructors[0].newInstance();
	}
	
	@Test
	public void testBinarySearch() {
		int[] arr = new int[] {1,2,3,4,5,6};
		
		for (int k: arr) {
			int resp = divide.binarySerach(arr, k);
			assertEquals(k, resp);
		}
		
		int resp = divide.binarySerach(arr, 10);
		assertEquals(-1, resp);
	}
	
	@Test
	public void testSum() {
		int[] arr = new int[] {1,2,3,4,5,6};				
		int resp = divide.sum(arr);
		assertEquals(21, resp);
	}
	
	@Test 
	public void launchBenchmark() throws Exception {
		Options opt = new OptionsBuilder()
                // Specify which benchmarks to run. 
                // You can be more specific if you'd like to run only one benchmark per test.
                .include(this.getClass().getName() + ".*")
                // Set the following options as needed
                .mode (Mode.AverageTime)
                .timeUnit(TimeUnit.MICROSECONDS)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(2)
                .measurementTime(TimeValue.seconds(1))
                .measurementIterations(2)
                .threads(2)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                //.jvmArgs("-XX:+UnlockDiagnosticVMOptions", "-XX:+PrintInlining")
                //.addProfiler(WinPerfAsmProfiler.class)
                .build();

            new Runner(opt).run();
	}
}
