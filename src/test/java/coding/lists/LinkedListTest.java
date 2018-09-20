package coding.lists;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedListI list = null;
	
	@Before
	public void init() throws Exception {
		Class<?> clazz =  Class.forName("coding.lists.LinkedList");
		Constructor<?>[] constructors = clazz.getConstructors();
		list = (LinkedListI)
				constructors[0].newInstance();
	}
	
	@Test
	public void testHasCycle() {
		
		Node head = list.insertNode(null, 1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		boolean res = list.hasCycle(head);
		assertEquals(false, res);
	}
	
	@Test
	public void testHasCycle1() {
		
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
		
		Node head = list.insertNode(null, 1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(3);
		boolean res = list.hasCycle(head);
		assertEquals(true, res);
	}
	@Test
	public void testHasCycle13() {
		
		Node head = list.insertNode(null, 1);
		head.next = new Node(1);
		head.next.next = new Node(3);
		boolean res = list.hasCycle(head);
		assertEquals(true, res);
	}
}
