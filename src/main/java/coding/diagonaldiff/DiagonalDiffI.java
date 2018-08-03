package coding.diagonaldiff;
/**
 *  Given a square matrix, calculate the absolute difference between the sums of its diagonals.
	For example, the square matrix  is shown below:
    1 2 3
	4 5 6
	9 8 9
	Result: 1+5+9 = 15, and 3 + 5 + 9 = 17, then 17-15 = 2  
 * @author rodrigo ruiz
 *
 */
public interface DiagonalDiffI {
	int diagonalDifference(int[][] arr);
}
