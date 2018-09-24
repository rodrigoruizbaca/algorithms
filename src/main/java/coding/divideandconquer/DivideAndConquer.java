package coding.divideandconquer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivideAndConquer implements DivideAndConquerI {

	@Override
	public int binarySerach(int[] arr, int key) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return binarySearchHelper(list, key);
	}

	private int binarySearchHelper(List<Integer> list, int key) {		
		if (list.size() == 1) {
			if (key == list.get(0)) 
				return list.get(0);
			else {
				return -1;
			}
		} else if (list.size() < 1) {
			return -1;
		} else {
			int mid = list.size() / 2;					
			List<Integer> left = list.subList(0, mid);
			List<Integer> right = list.subList(mid, list.size());
									
			//Going to right
			if (key > left.get(left.size()-1)) {
				return binarySearchHelper(right, key);
			} else {
				//Going to left
				return binarySearchHelper(left, key);
			}
		}				
	}

	@Override
	public int sum(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return sumHelper(list);
	}
	
	private int sumHelper(List<Integer> list) {
		if (list.size() == 1) {
			return list.get(0);
		}
		int mid = list.size() / 2;
		List<Integer> left = list.subList(0, mid);
		List<Integer> right = list.subList(mid, list.size());
		return sumHelper(left) + sumHelper(right);
	}
}
