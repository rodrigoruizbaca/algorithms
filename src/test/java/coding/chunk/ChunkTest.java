package coding.chunk;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class ChunkTest {
	ChunkI chunk = new Chunk(); 
	
	@Test
	public void test1() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<int[]> chunked = chunk.chunk(arr, 2);
		List<int[]> expected = new ArrayList<>();
		expected.add(new int[] {1,2});
		expected.add(new int[] {3,4});
		expected.add(new int[] {5,6});
		expected.add(new int[] {7,8});
		expected.add(new int[] {9,10});
						
		assertArrayEquals(expected.get(0), chunked.get(0));
		assertArrayEquals(expected.get(1), chunked.get(1));
		assertArrayEquals(expected.get(2), chunked.get(2));
		assertArrayEquals(expected.get(3), chunked.get(3));
		assertArrayEquals(expected.get(4), chunked.get(4));
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 2, 3};
		List<int[]> chunked = chunk.chunk(arr, 1);
		List<int[]> expected = new ArrayList<>();
		expected.add(new int[] {1});
		expected.add(new int[] {2});
		expected.add(new int[] {3});
		assertArrayEquals(expected.get(0), chunked.get(0));
		assertArrayEquals(expected.get(1), chunked.get(1));
		assertArrayEquals(expected.get(2), chunked.get(2));
	}
	
	@Test
	public void test3() {
		int[] arr = {1, 2, 3, 4, 5};
		List<int[]> chunked = chunk.chunk(arr, 3);
		List<int[]> expected = new ArrayList<>();
		expected.add(new int[] {1,2,3});
		expected.add(new int[] {4,5});
		assertArrayEquals(expected.get(0), chunked.get(0));
		assertArrayEquals(expected.get(1), chunked.get(1));
	}
}
