package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller implements IController {
	public LinkedList<Course> courses;
	public PriorityQueue<Request> requestQueue;
	public String fileIn;
	public String fileIn1;
	public String major;
	public String courseNum;
	public String cap;
	
	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, String fileIn, String fileIn1) {
		this.courses = courses;
		this.requestQueue = requestQueue;
		this.fileIn = fileIn;
		this.fileIn1 = fileIn1;
	}

	@Override
	public void readCourseFile() {
		// TODO Auto-generated method stub
		String[] array = new String[3];
		
		File file = new File(fileIn);
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				array = scanner.toString().split(",");
				major = array[0];
				courseNum = array[1];
				cap = array[2];
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void readRequestFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void processRequests() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRequest(Request req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
