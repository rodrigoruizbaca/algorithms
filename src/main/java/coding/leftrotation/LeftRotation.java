package coding.leftrotation;

public class LeftRotation implements LeftRotationI {

	@Override
	public int[] leftRotation(int[] arr, int times) {
		int mod = times % arr.length;
		int res[] = new int[arr.length];
		for (int x = 0; x < arr.length; x++) {
			res[x] = arr[ (x+mod) % arr.length];
		}
		return res;
	}

	/*for(int x = 0; x <= array.length-1; x++){
		newArray[(x+a) % array.length ] = array[x];
	}*/

}
