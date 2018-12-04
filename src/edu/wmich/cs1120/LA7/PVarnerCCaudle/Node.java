package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class Node<E> implements INode {
	private E dataValue;
	Node<E> nextNode;
	
	public Node(E dataValue) {
		this.dataValue = dataValue;
		
	}
	public Node(E dataValue, Node<E> nextNode) {
		this.dataValue = dataValue;
		setNext(nextNode);
	}

	@Override
	public E getData() {
		return dataValue;
	}

	@Override
	public Node getNext() {
		return nextNode;
	}

	@Override
	public void setNext(Node next) {
		nextNode = next;
		
	}

}
