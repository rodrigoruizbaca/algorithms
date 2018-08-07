package coding.trees;

import java.util.ArrayList;
import java.util.List;

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
	public String levelOrder(Node n) {
		List<Node> arr = new ArrayList<>();
		arr.add(n);
		helper(n, arr);		
		String str = "";
		for (Node x: arr) {
			str += x.data + " ";
		}
		return str.substring(0, str.length()-1);
	}
	
	private void helper(Node root, List<Node> arr) {
		if (root == null) return;
		if (root.left != null) {
			arr.add(root.left);			
		}
		if (root.right != null) {
			arr.add(root.right);			
		}
		helper(root.left, arr);
		helper(root.right, arr);
		
	}

	@Override
	public int height(Node root) {
		if (root == null) return 0;
		int left = height(root.left);
		int right = height(root.right);			
		return Math.max(left, right) + 1;
	}
	
	

}
