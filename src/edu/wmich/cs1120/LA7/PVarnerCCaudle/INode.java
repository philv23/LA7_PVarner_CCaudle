package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public interface INode<E> {
	    // Returns the data stored in this node.
	    /**
	     * Returns the data stored in this node.
	     * @return dataValue
	     */
	    E getData();
	    // Returns the node next to this node.
	    /**
	     * Returns the node next to this node.
	     * @return nextNode
	     */
		Node getNext();
		// Sets node received as the next node to this node.
		/**
		 * Sets node received as the next node to this node.
		 * @param next 
		 */
		void setNext(Node next);
		
	}

