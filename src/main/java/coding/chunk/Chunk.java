package coding.chunk;

import java.util.ArrayList;
import java.util.List;

public class Chunk implements ChunkI {

	@Override
	public List<int[]> chunk(int[] arr, int size) {
		List<int []> chunked = new ArrayList<>();
		chunked.add(new int[]{arr[0]});		
		for (int x = 1; x < arr.length; x++) {
			int lastChunk[] = chunked.get(chunked.size() - 1);
			if (lastChunk.length == size) {
				chunked.add(new int[]{arr[x]});
			} else {
				lastChunk = addItem(lastChunk, arr[x]);	
				chunked.set(chunked.size() - 1, lastChunk);
			}
		}
				
		return chunked;
	}
	
	

	
	private int[] addItem(int arr[], int val) {
		int newarr[] = new int[arr.length + 1];
		for (int x = 0; x < arr.length; x++) {
			newarr[x] = arr[x];
		}
		newarr[arr.length] = val;
		return newarr;
	}
}
