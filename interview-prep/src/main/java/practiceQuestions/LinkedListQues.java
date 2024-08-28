package practiceQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListQues {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(5);
		Node fifth = new Node(8);
		Node sixth = new Node(9);

		// Connect nodes to form a linked list: 1 -> 2 -> 3 -> null
		head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		//sixth.next=head; making ll cyclic

		// printLinkedList(head);
		// findMiddleOfLinkedListBruteForce(head);
		//findMiddleOfLinkedList2Pointers(head);
		//reverse(head);
		//findLenghtOfLinkedList(head);
		//checkLinkedListIsCyclick(head);
		removeFirstAndLastFromLL();
	}

	private static void removeFirstAndLastFromLL() {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.addAll(Arrays.asList(10,40,50,30,20));
		System.out.println(ll);
		
		ll.addFirst(0);
		System.out.println(ll);
		
		ll.addLast(60);
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
	}

	/*
	   1) Use two pointers fast and slow
       2) Move fast two nodes and slow one node in each iteration
       3) If fast and slow meet then the linked list contains a cycle
       4) if fast points to null or fast.next points to null then linked list is not cyclic
	 */
	private static void checkLinkedListIsCyclick(Node head) {
		// Initialize the slow and fast pointer to the head
				// of the linked list
		Node slow_ptr=head;
		Node fast_ptr=head;
		while(fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr==fast_ptr) {
				System.out.println("it is cyclic");
				break;
			}
		}
		
	}

	private static void findLenghtOfLinkedList(Node head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		System.out.println(count);
	}

	private static void reverse(Node head) {
		printLinkedList(head);
		Node prev=null;
		Node cur=head;
		Node next=null;
		while(cur!=null) {
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		//printLinkedList(prev);
		while (prev != null) {
			System.out.print(prev.val + " -> ");
			prev = prev.next;
		}
		System.out.println("null");
	}

	private static void findMiddleOfLinkedList2Pointers(Node head) {

		// Initialize the slow and fast pointer to the head
		// of the linked list
		Node slow_ptr = head;
		Node fast_ptr = head;

		while (fast_ptr != null && fast_ptr.next != null) {
			// Move the slow pointer by one node
			slow_ptr = slow_ptr.next;

			// Move the fast pointer by two nodes
			fast_ptr = fast_ptr.next.next;
		}

		// Return the slow pointer which is currently
		// pointing to the middle node of the linked list
		// return slow_ptr.val;
		System.out.println(slow_ptr.val);
	}

	private static void findMiddleOfLinkedListBruteForce(Node head) {
		Vector<Integer> v = new Vector<>();
		while (head != null) {
			v.add(head.val);
			head = head.next;
		}
		int middle = v.size() / 2;
		System.out.println(middle);
		System.out.println(v.get(middle));
	}

	// Method to print the elements of the linked list
	public static void printLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

}

class Node {
	int val;
	Node next;

	public Node(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
		this.next = null;
	}
}
