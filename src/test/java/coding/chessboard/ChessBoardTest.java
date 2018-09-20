package coding.chessboard;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
public class ChessBoardTest {
	
	ChessBoardI board = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.chessboard.ChessBoard");
		Constructor<?>[] constructors = clazz.getConstructors();
		board = (ChessBoardI)
				constructors[0].newInstance();
	}
	
	@Test
	public void test1() {
		
		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0,1}));
		matrix.add(Arrays.asList(new Integer[] {1,0}));
		assertTrue(board.solve(matrix));
	}
	
	@Test
	public void test2() {
		
		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		assertTrue(board.solve(matrix));
	}
	
	@Test
	public void test3() {

		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 0}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		assertTrue(!board.solve(matrix));
	}
}
