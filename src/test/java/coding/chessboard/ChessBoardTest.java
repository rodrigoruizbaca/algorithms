package coding.chessboard;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class ChessBoardTest {
	@Test
	public void test1() {
		ChessBoardI board = new ChessBoard();
		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0,1}));
		matrix.add(Arrays.asList(new Integer[] {1,0}));
		assertTrue(board.solve(matrix));
	}
	
	@Test
	public void test2() {
		ChessBoardI board = new ChessBoard();
		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		assertTrue(board.solve(matrix));
	}
	
	@Test
	public void test3() {
		ChessBoardI board = new ChessBoard();
		List<List<Integer>> matrix = new ArrayList<>();		
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 0}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		matrix.add(Arrays.asList(new Integer[] {0, 1, 0, 1}));
		matrix.add(Arrays.asList(new Integer[] {1, 0, 1, 0}));
		assertTrue(!board.solve(matrix));
	}
}
