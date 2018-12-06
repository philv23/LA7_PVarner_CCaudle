package edu.wmich.cs1120.LA7.PVarnerCCaudle;

public class Request<T> implements Comparable<T> {

	String studentName;
	String studentDept;
	String studentLevel;
	String courseDept;
	int courseNumber;
	double[][] GPA_Array;

	// Constructor
	/**
	 * Constructor sets it's parameters.
	 * @param studentName
	 * @param studentDept
	 * @param studentLevel
	 * @param courseDept
	 * @param courseNumber
	 * @param gPA_Array
	 */
	public Request(String studentName, String studentDept, String studentLevel, String courseDept, int courseNumber,
			double[][] gPA_Array) {
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentLevel = studentLevel;
		this.courseDept = courseDept;
		this.courseNumber = courseNumber;
		GPA_Array = gPA_Array;
	}

	// Returns number of years to graduation (0 for seniors, 1 for juniors etc.).
	// This is determined from the
	// student’s level – senior, junior, etc.
	/**
	 * Returns number of years to graduation.  This is determined from the student’s level.
	 * @param level
	 * @return integer
	 */
	public int yearsFromGraduation(String level) {
		int years = 0;
		if (level == "Freshman") {
			years = 3;
		}
		if (level == "Junior") {
			years = 1;
		}
		if (level == "Senior") {
			years = 0;
		} else {
			years = 2;
		}

		return years;
	}

	// Calculate the GPA for a particular student.
	/**
	 * Calculates the GPA for a particular student.
	 * @param GPA_Array
	 * @return double
	 */
	private double GPA_Cal(double[][] GPA_Array) {
		double calc = 0;
		double gpa = 0;
		double credits = 0;
		
		
		for (int i = 0; i < GPA_Array.length; i++) {
			calc = GPA_Array[i][0] * GPA_Array[i][1];
			credits = credits + GPA_Array[i][1];
			gpa = gpa + calc;
		}
		
		gpa = gpa/credits;
		
		return gpa;
		
	}

	
	/**
	 * returns student name.
	 * @return String
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * returns student department.
	 * @return String
	 */
	public String getStudentDept() {
		return studentDept;
	}
	/**
	 * returns course department.
	 * @return String
	 */
	public String getCourseDept() {
		return courseDept;
	}
	/**
	 * returns course number.
	 * @return integer
	 */
	public int getCourseNumber() {
		return courseNumber;
	}
	
	@Override
	/**
	 * Compares to the object and return 1 or 0 if the object is high priority.
	 * @return integer
	 */
	public int compareTo(T o) {
		Request req = (Request) o;
		int num = 0;
		
		if(req.studentDept == "CS" && studentDept != "CS") {
			num = 1;	
		}
		if(num == 0 && yearsFromGraduation(req.studentLevel) < yearsFromGraduation(studentLevel)) {
			num = 1;
		}
		if(num == 0 && GPA_Cal(req.GPA_Array) > GPA_Cal(GPA_Array)) {
			num = 1;
		}
		
		return num;
	}
	
	

	// Getters for a student’s name and department, and the department and number
	// of a course

}
