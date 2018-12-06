package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class Node<E> implements INode {
	private E dataValue;
	Node<E> nextNode;
	public Node next;
	
	/**
	 * constructor sets dataValue.
	 * @param dataValue
	 */
	public Node(E dataValue) {
		this.dataValue = dataValue;
		
		
	}
	/**
	 * constructor sets dataValue and calls setNext(nextNode).
	 * @param dataValue
	 * @param nextNode
	 */
	public Node(E dataValue, Node<E> nextNode) {
		this.dataValue = dataValue;
		setNext(nextNode);
	}

	@Override
	/**
	 * Returns the data stored in this node.
	 * @return E
	 */
	public E getData() {
		return dataValue;
	}

	@Override
	/** 
	 * Returns the node next to this node.
	 * @return Node
	 */
	public Node getNext() {
		return nextNode;
	}

	@Override
	/**
	 * Sets node received as the next node to this node.
	 * @param next
	 */
	public void setNext(Node next) {
		nextNode = next;
		
	}

}
