package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public interface INode<E> {
	    <E> // Returns the data stored in this node.
	    E getData();
	// Returns the node next to this node.
		Node getNext();
		// Sets node received as the next node to this node.
		void setNext(Node next);
		
	}

