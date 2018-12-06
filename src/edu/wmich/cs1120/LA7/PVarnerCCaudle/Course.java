package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class Course<E> implements ICourse {
	
	
	String dept;
	String num;
	int max;
	LinkedList<E> list = new LinkedList<E>();
	
	
	/**
	 * Constructor sets it's parameters.
	 * @param dept
	 * @param num
	 * @param max
	 */
	public Course(String dept, String num, int max) {
		this.dept = dept;
		this.num = num;
		this.max = max;
	}

	@Override
	/**
	 * Determine if the capacity for this course has been reached.
	 * @return boolean
	 */
	public boolean isFull() {
		if(list.size() >= max) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	/**
	 * Add this student to the linkedlist for enrolled students for this course.
	 * @param name
	 */
	public void addStudent(String name) {
		list.add((E) name);
	}

	@Override
	/**
	 * Prints the classlist for this course.
	 */
	public void printClassList() {
		LinkedList<E> list2 = list;
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.value);
			list2.head = list2.next;
		}

	}
	
	@Override
	/**
	 * Determines if this course object is the same as the object received as parameter.
	 * @param arg0
	 * @return boolean
	 */
	public boolean equals(Object arg0) {
		Course c = (Course) arg0;
		
		if(c.dept == dept && c.num == num) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
