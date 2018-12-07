package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Controller implements IController {
	public LinkedList<Course> courses;
	public PriorityQueue<Request> requestQueue;
	public BufferedReader fileIn;
	public BufferedReader fileIn1;

	ArrayList<String> processes = new ArrayList<String>();
	
	
	/**
	 * constructor sets courses list, requestQueue, and the input files
	 * 
	 * @param dataValue
	 * @param nextNode
	 */

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
		System.out.println("");
		System.out.println("<<<<<<<<<<<< Beginning of Queue Contents >>>>>>>>>>>>>>>>>");

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

				for (int i = 0; i < 4; i++) {
					gpa[i][0] = Double.parseDouble(st.nextToken());
					gpa[i][1] = Double.parseDouble(st.nextToken());
				}

				String process = "@" + generateString(8);

				processes.add(process);

				System.out.println("Request" + process);

				Request req = new Request(name, major, year, dept, num, gpa);

				boolean flag = false;

				requestQueue.enqueue(req);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (requestQueue.isEmpty()) {
			System.out.println("Queue is Empty");
		}

		System.out.println("<<<<<<<<<<<< End of Queue Contents >>>>>>>>>>>>>>>>>\n");

	}

	@Override
	public void processRequests() {

		for (int j = 0; j < courses.size(); j++) {

			Course one = courses.get(j);

			int i = 0;

			while (!one.isFull() && i < requestQueue.pQueue.size()) {
				Request a = requestQueue.pQueue.get(i);

				if (a.getCourseNumber() == one.num2) {
					one.addStudent(a.getStudentName());
					System.out.println("Request" + processes.get(i) + "  Processed");
					System.out.println(a.getStudentName() + " successfully registered " + a.getCourseDept() + " "
							+ a.getCourseNumber());

				}

				i++;
			}

			while (one.isFull() && i < requestQueue.pQueue.size()) {
				Request a = requestQueue.pQueue.get(i);

				if (a.getCourseNumber() == one.num2) {
					System.out.println("Request Processed");
					System.out.println(a.getStudentName() + " cannot be registered for " + a.getCourseDept() + " "
							+ a.getCourseNumber() + " Course is Full");

				}

				i++;
			}

		}
	}

	@Override
	public void printClassList() {
		System.out.println("");
		for (int i = 0; i < courses.size(); i++) {
			System.out.print("Class List for: ");
			System.out.println(courses.get(i).dept + " " + courses.get(i).num2);

			courses.get(i).printClassList();

			System.out.println("");
		}

	}

	@Override
	public void addRequest(Request req) {
		requestQueue.enqueue(req);

	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		Course c1 = null;
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).dept.equals(courseDept) && courses.get(i).num2 == courseNumber) {
				c1 = courses.get(i);
			}
		}
		return c1;
	}

	public String generateString(int length) {
		String alphabet = "abcde0123456789";
		Random random = new Random();
		StringBuilder builder = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			builder.append(alphabet.charAt(random.nextInt(alphabet.length())));
		}

		return builder.toString();
	}

}