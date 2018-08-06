package coding.chessboard;

import java.util.List;
import java.util.stream.Collectors;

public class ChessBoard implements ChessBoardI {

	@Override
	public boolean solve(List<List<Integer>> board) {
		List<Integer> lst = board.stream().flatMap(ele -> ele.stream()).collect(Collectors.toList());
		for (int x = 0; x < lst.size() - 1; x++) {
			if (lst.get(x) == lst.get(x+1)) {
				return false;
			}
			x++;
		}
		return true;
	}

}
