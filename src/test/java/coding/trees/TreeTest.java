package coding.trees;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
	
	TreeI tree;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.trees.Tree");
		Constructor<?>[] constructors = clazz.getConstructors();
		tree = (TreeI)
				constructors[0].newInstance();
	}
	
	@Test
	public void testPreorder() {
		
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
		Node root = tree.insert(null, 1);
		Node dos = tree.insert(root, 2);
		Node cinco = tree.insert(dos, 5);
		Node tres = tree.insert(cinco, 3);
		tree.insert(cinco, 6);
		tree.insert(tres, 4);
		String res = tree.inOrder(root);
		assertEquals("1 2 3 4 5 6", res);
		
		List<Integer> lstRes = tree.inOrderAlt(root);
		List<Integer> lstExp = new ArrayList<>();
		lstExp.add(1);
		lstExp.add(2);
		lstExp.add(3);
		lstExp.add(4);
		lstExp.add(5);
		lstExp.add(6);
		assertEquals(lstExp.get(0), lstRes.get(0));
		assertEquals(lstExp.get(1), lstRes.get(1));
		assertEquals(lstExp.get(2), lstRes.get(2));
		assertEquals(lstExp.get(3), lstRes.get(3));
		assertEquals(lstExp.get(4), lstRes.get(4));
		assertEquals(lstExp.get(5), lstRes.get(5));
	}
	
	@Test
	public void testlevelOrder() {
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
