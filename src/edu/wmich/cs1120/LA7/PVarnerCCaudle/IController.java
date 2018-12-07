package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public interface IController {
	// Read courses from input file and add each course to a LinkedList of courses.
	// Close file.
	/**
	 * Reads courses from input file and add each course to a LinkedList of courses.
	 */
	void readCourseFile(); // Use a try-catch block.
	// Read each request from the request input file and use it to create a Request
	// object.

	/**
	 * Reads each request from the request input file and use it to create a Request
	 * object.
	 */
	void readRequestFile(); // Use a try-catch block.
	// Store the request object in the requests priority queue.

	/**
	 * Store the request object in the requests priority queue.
	 * 
	 * @param req
	 */
	void addRequest(Request req);

	// Process all the requests as follows: if request can be granted, update the
	// relevant classlist,
	// update the class/course capacity, print out a message that the student who
	// made that
	// request has been successfully registered for that course. Else, print out a
	// message that
	// student could not be registered.
	/**
	 * Process all the requests as follows: if request can be granted, update the
	 * relevant classlist, update the class/course capacity, print out a message
	 * that the student who made that request has been successfully registered for
	 * that course. Else, print out a message that student could not be registered.
	 */
	void processRequests();

	// Return the course object with data values that match the parameters received.
	/**
	 * Return the course object with data values that match the parameters received.
	 * 
	 * @param courseDept
	 * @param courseNumber
	 * @return Course
	 */
	Course getCourse(String courseDept, int courseNumber);

	// Print classlists for all courses.
	/**
	 * Print classlists for all courses.
	 */
	void printClassList();
}
