package coding.chessboard;

import java.util.List;
/**
 * Since all chess boards available in the market are 8x8 boards, Alex decides to paint a customised NxN board. 
 * Given the painted chess board, can you tell if it is painted correctly or not ?
 * A chess board is considered valid if every  adjacent cells are painted with different color. 
 * Two cells are considered adjacent if they share a boundary e.g.
 * 	0 1
 *	1 0
 *	True
 * @author rodrigo ruiz
 *
 */
public interface ChessBoardI {
	boolean solve(List<List<Integer>> board);
}
