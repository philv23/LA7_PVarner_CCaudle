package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class PriorityQueue {
	
	// Determine if the priority queue is empty.
		public boolean isEmpty();
		// Add object received to the priority queue taking into consideration the rules governing priority.
		public void enqueue(E data);
		// Remove the next object to be processed from the priority queue.
		public E dequeue();
		// Print the contents of the queue
		public void Qprint();
}
