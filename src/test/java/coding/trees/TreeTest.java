package coding.trees;

import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
	@Test
	public void testPreorder() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		String res = tree.preOrder(root);
		assertEquals("1 2 5 3 4 6", res);
	}
	
	@Test
	public void testPostorder() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		String res = tree.postOrder(root);
		assertEquals("4 3 6 5 2 1", res);
	}
	
	@Test
	public void testInorder() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		String res = tree.inOrder(root);
		assertEquals("1 2 3 4 5 6", res);
	}
	
	@Test
	public void testlevelOrder() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		String res = tree.levelOrder(root);
		assertEquals("1 2 5 3 6 4", res);
	}
	
	
	@Test
	public void testHeigth() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		int res = tree.height(root);
		assertEquals(5, res);
	}
	
	@Test
	public void testHeigth1() {
		TreeI tree = new Tree();
		Node root = tree.insert(null, 1);
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		int res = tree.height(root);
		assertEquals(3, res);
	}
}
