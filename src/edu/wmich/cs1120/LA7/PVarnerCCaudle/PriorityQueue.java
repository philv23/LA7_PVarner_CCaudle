package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class PriorityQueue<E> {
		
		LinkedList<E> pQueue = new LinkedList<E>();
		LinkedList<Request> students = new LinkedList<Request>();
		
		
	    public PriorityQueue() {
			
		}
		// Determine if the priority queue is empty.
		public boolean isEmpty() {
			if(pQueue.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
		}
		// Add object received to the priority queue taking into consideration the rules governing priority.
		public void enqueue(E data) {
			
			pQueue.add(data);
			
			
		}
		// Remove the next object to be processed from the priority queue.
		public E dequeue() {
			LinkedList<E> temp = new LinkedList<E>();
			E processed;
			processed = pQueue.get(0);
			for(int i=0; i<pQueue.size(); i++) {
				
				temp.add(pQueue.get(i+1));
			}
			pQueue = temp;
			return processed;
			
		}
		// Print the contents of the queue
		public void Qprint() {
			for(int i=0; i<pQueue.size(); i++){
				System.out.println(pQueue.get(i));
			}
			
		}
}
