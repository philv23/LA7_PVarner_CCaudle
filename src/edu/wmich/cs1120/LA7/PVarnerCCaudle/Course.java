package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class Course<E> implements ICourse {
	
	
	String dept;
	String num;
	int max;
	LinkedList<E> list = new LinkedList<E>();
	
	

	public Course(String dept, String num, int max) {
		this.dept = dept;
		this.num = num;
		this.max = max;
	}

	@Override
	public boolean isFull() {
		if(list.size() >= max) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void addStudent(String name) {
		list.add((E) name);
	}

	@Override
	public void printClassList() {
		LinkedList<E> list2 = list;
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.value);
			list2.head = list2.next;
		}

	}
	
	@Override
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
