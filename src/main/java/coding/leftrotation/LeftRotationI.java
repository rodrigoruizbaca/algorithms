package coding.leftrotation;
/**
 * A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
 * For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
 * @author rodrigo ruiz
 *
 */
public interface LeftRotationI {
	int[] leftRotation(int arr[], int times);
}
