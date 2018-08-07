package coding.lists;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
	@Test
	public void testHasCycle() {
		LinkedListI list = new LinkedList();
		Node head = list.insertNode(null, 1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		boolean res = list.hasCycle(head);
		assertEquals(false, res);
	}
	
	@Test
	public void testHasCycle1() {
		LinkedListI list = new LinkedList();
		Node head = list.insertNode(null, 1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(3);
		boolean res = list.hasCycle(head);
		assertEquals(true, res);
	}
	
	@Test
	public void testHasCycle12() {
		LinkedListI list = new LinkedList();
		Node head = list.insertNode(null, 1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(3);
		boolean res = list.hasCycle(head);
		assertEquals(true, res);
	}
}
