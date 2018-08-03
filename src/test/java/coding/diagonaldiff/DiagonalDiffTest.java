package coding.diagonaldiff;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiagonalDiffTest {
	
	DiagonalDiffI diff = new DiagonalDiff();
	
	@Test
	public void test1() throws Exception {
		
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 9;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int sum = diff.diagonalDifference(arr);
		
		assertEquals(2, sum);
	}
	
	@Test
	public void test2() throws Exception {
		
		int[][] arr = new int[3][3];
		arr[0][0] = 11;
		arr[0][1] = 2;
		arr[0][2] = 4;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 10;
		arr[2][1] = 8;
		arr[2][2] = -12;
		
		int sum = diff.diagonalDifference(arr);
		
		assertEquals(15, sum);
	}
	
}
