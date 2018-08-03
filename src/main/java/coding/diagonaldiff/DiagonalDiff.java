package coding.diagonaldiff;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DiagonalDiff implements DiagonalDiffI {

	@Override
	public int diagonalDifference(int[][] arr) {			
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> sum = executor.submit(() -> sumPrimary(arr));
		Future<Integer> sum1 = executor.submit(() -> sumSecond(arr));		
		try {
			return Math.abs(sum.get() - sum1.get());
		} catch (InterruptedException | ExecutionException e) {			
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
		return 0;
	}
	
	private int sumPrimary(int[][] arr) {
		int size = arr[0].length;	
		int row = 0;
		int col = 0;
		int acum = 0;
		for (int x = 0; x < size; x++) {
			acum += arr[row++][col++];			
		}
		return acum;
	}
	
	private int sumSecond(int[][] arr) {
		int size = arr[0].length;	
		int row = size-1;
		int col = 0;
		int acum = 0;
		for (int x = 0; x < size; x++) {
			acum += arr[row--][col++];			
		}
		return acum;
	}

}
