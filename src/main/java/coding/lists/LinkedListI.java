package coding.lists;

public interface LinkedListI {
	default Node insertNode(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		Node cur = insertNode(root.next, data);
		root.next = cur;
		return root;
	}
	
	public boolean hasCycle(Node root);
}
