package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public interface ICourse{
	// Determine if the capacity for this course has been reached.
	/**
	 * Determine if the capacity for this course has been reached.
	 * @return boolean
	 */
	boolean isFull();
	// Add this student to the linkedlist for enrolled students for this course.
	/**
	 * Add this student to the linkedlist for enrolled students for this course.
	 * @param name
	 */
	void addStudent(String name);
    // Print the classlist for this course.
	/**
	 * Prints the classlist for this course.
	 */
	void printClassList();
	// Determines if this course object is the same as the object received as parameter.
	/**
	 * Determines if this course object is the same as the object received as parameter.
	 * @param arg0
	 * @return boolean
	 */
	boolean equals(Object arg0);
}

