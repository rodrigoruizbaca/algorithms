package coding.lists;

public class LinkedList implements LinkedListI {

	@Override
	public boolean hasCycle(Node root) {		
		if (root == null) return false;
		Node slow = root; 
		Node fast = root;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast != null && slow.data == fast.data) {
				return true;
			}
		}
		return false;
	}

}
