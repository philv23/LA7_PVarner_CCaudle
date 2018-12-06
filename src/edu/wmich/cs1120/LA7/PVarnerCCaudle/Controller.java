package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Controller implements IController {
	public LinkedList<Course> courses;
	public PriorityQueue<Request> requestQueue;
	public BufferedReader fileIn;
	public BufferedReader fileIn1;

	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, BufferedReader fileIn,
			BufferedReader fileIn1) {
		this.courses = courses;
		this.requestQueue = requestQueue;
		this.fileIn = fileIn;
		this.fileIn1 = fileIn1;
	}

	@Override
	public void readCourseFile() {
		String strCurrentLine;

		try {
			while ((strCurrentLine = fileIn.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(strCurrentLine, ",");

				String dept = st.nextToken();
				String num = st.nextToken();
				String m1 = st.nextToken();
				int max = Integer.parseInt(m1);

				Course c1 = new Course(dept, num, max);

				courses.add(c1);

				System.out.println(strCurrentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void readRequestFile() {
		String strCurrentLine;

		try {
			while ((strCurrentLine = fileIn1.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(strCurrentLine, ",");

				String name = st.nextToken();
				String year = st.nextToken();
				String major = st.nextToken();
				String dept = st.nextToken();
				
				String cs = st.nextToken();
				int num = Integer.parseInt(cs);
				
				
				double[][] gpa = new double[4][2];
				
				for(int i = 0; i < 4; i ++) {
					gpa[i][0] = Double.parseDouble(st.nextToken());
					gpa[i][1] = Double.parseDouble(st.nextToken());
				}
				
				Request req = new Request(name, major, year, dept, num, gpa);
				
				requestQueue.enqueue(req);

				System.out.println(strCurrentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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