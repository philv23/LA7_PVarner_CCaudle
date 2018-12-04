package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import edu.wmich.cs1120.linkedlists.LinkedList.Node;

public class LinkedList<E> {
	
	private String value;
	private Node next;
	private Node head;
	private Node tail;
	
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	// Add object received to the linked list if he/she has the priority.
	public void add(E item) {
		if (isEmpty()) {
			Node newNode = new Node(item);
			head = newNode;
			tail = head;
		}
		else {
			Node newNode = new Node(item);
			tail.next = newNode;
			tail = tail.next;
		}
		
	}
	// get the object in specific position in the LinkedList used to print the enrolled student contents inside the Course class and return the name
	public E get(int position);
	// Return number of elements in the list.
	public int size();
}
