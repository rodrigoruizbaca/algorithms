package coding.trees;

import java.util.List;

public interface TreeI {
	default Node insert(Node n, int data) {
		if (n == null) {
			return new Node(data);
		}
		if (data <= n.data) {
			Node cur = insert(n.left, data);
			n.left = cur;
		} else {
			Node cur = insert(n.right, data);
			n.right = cur;
		}
		return n;
	}
	
	String preOrder(Node n);
	String postOrder(Node n);
	String inOrder(Node n);
	List<Integer> inOrderAlt(Node n);
	String levelOrder(Node n); //Breadth First Traversal
	int height(Node root);
}
