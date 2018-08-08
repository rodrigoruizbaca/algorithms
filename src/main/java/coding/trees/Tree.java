package coding.trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tree implements TreeI {

	@Override
	public String preOrder(Node n) {
		String str = "";
		if (n != null) {
			str += n.data + " " + (n.left != null ? preOrder(n.left) + " " : "") + (n.right != null ? preOrder(n.right) + " " : "");
			str = str.trim();
		}
		return str;
	}

	@Override
	public String postOrder(Node n) {
		String str = "";
		if (n != null) {
			str += (n.left != null ? postOrder(n.left) + " " : "") + (n.right != null ? postOrder(n.right) + " " : "") + n.data;
			str = str.trim();
		}
		return str;
	}

	@Override
	public String inOrder(Node n) {
		String str = "";
		if (n != null) {
			str += (n.left != null ? inOrder(n.left) + " " : "") +  n.data + " " + (n.right != null ? inOrder(n.right) + " " : "");
			str = str.trim();
		}
		return str;
	}

	@Override
	public String levelOrder(Node root) {
		Deque<Node> arr = new ArrayDeque<>();
		arr.add(root);
		String str = "";
		while (!arr.isEmpty()) {
			Node n = arr.poll();
			if (n.left != null) {
				arr.add(n.left);
			}
			if (n.right != null) {
				arr.add(n.right);
			}
			str += n.data + " ";
		}	
		return str.substring(0, str.length()-1);
	}
	
	@Override
	public int height(Node root) {
		if (root == null) return 0;
		int left = height(root.left);
		int right = height(root.right);			
		return Math.max(left, right) + 1;
	}
	
	

}
