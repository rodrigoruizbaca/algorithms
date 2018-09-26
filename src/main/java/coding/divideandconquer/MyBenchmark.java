package coding.divideandconquer;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Fork(value=1)
@Warmup(iterations=1)
@Measurement(iterations=2)
@Threads(value = 4)
public class MyBenchmark {
	DivideAndConquer div = new DivideAndConquer();
	@State(Scope.Thread)
    public static class Data {
          int[] testValue;

          public Data() {
                this.testValue = new int[] {100,100,100};
          }
    }
	
	@Benchmark
	public int testRecursive(Data data) {
		
		return div.sum(data.testValue);
	}
	
	@Benchmark
	public int testStream(Data data) {
		
		return div.sumStream(data.testValue);
	}
}
