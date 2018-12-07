package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class LinkedList<E> {

	public String value;
	public Node next;
	public Node head;
	public Node tail;

	/**
	 * See's if the list is empty.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	// Add object received to the linked list if he/she has the priority.
	/**
	 * Add object received to the linked list if he/she has the priority.
	 * 
	 * @param item
	 */
	public void add(E item) {
		if (head == null) {
			Node newNode = new Node(item);
			head = newNode;
			tail = head;
		} else {
			Node newNode = new Node(item);
			tail.next = newNode;
			tail = tail.next;
		}

	}

	// get the object in specific position in the LinkedList used to print the
	// enrolled student contents inside the Course class and return the name
	/**
	 * get the object in specific position in the LinkedList used to print the
	 * enrolled student contents inside the Course class and return the name.
	 * 
	 * @param position
	 * @return E
	 */
	public E get(int position) {
		Node head1 = head;

		for (int i = 0; i < position; i++) {
			head1 = head1.next;

		}
		return (E) head1.getData();

	}

	// Return number of elements in the list.
	/**
	 * Return number of elements in the list.
	 * 
	 * @return integer
	 */
	public int size() {
		Node head1 = head;
		int i = 0;

		while (head1 != null) {
			head1 = head1.next;
			i++;
		}

		return i;

	}
}
