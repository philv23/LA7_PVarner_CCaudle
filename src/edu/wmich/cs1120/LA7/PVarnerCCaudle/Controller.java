package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;

public class Controller implements IController {
	public LinkedList<Course> courses;
	public PriorityQueue<Request> requestQueue;
	public PriorityQueue<Request> requestQueue2;
	public BufferedReader fileIn;
	public BufferedReader fileIn1;

	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, BufferedReader fileIn,
			BufferedReader fileIn1) {
		this.courses = courses;
		this.requestQueue = requestQueue;
		this.requestQueue2 = requestQueue;
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
				
				for(int i = 0; i < 4; i ++) {
					gpa[i][0] = Double.parseDouble(st.nextToken());
					gpa[i][1] = Double.parseDouble(st.nextToken());
				}
				
				String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				
				Random random = new Random();
				alphabet.charAt(random.nextInt(alphabet.length()));
				
				String process = generateString(8);
				
				System.out.println("Request@"+process);
				
				
				Request req = new Request(name, major, year, dept, num, gpa);
				
				boolean flag = false;
				
				requestQueue.enqueue(req);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<<<<<<<<<<<< End of Queue Contents >>>>>>>>>>>>>>>>>\n");

	}

	@Override
	public void processRequests() {
		for(int j = 0; j <courses.size(); j++) {
		
		Course one = courses.get(j);
		
		int i = 0;
		
		while(!one.isFull() && i < requestQueue.pQueue.size()) {
			Request a = requestQueue.pQueue.get(i);
			
			if(a.getCourseNumber() == one.num2) {
				one.addStudent(a.getStudentName());
				System.out.println("Request Processed");
				System.out.println(a.getStudentName() + " successfully registered " + a.getCourseDept() + " " + a.getCourseNumber());
				
			}
			
			
			i++;
		}
		
		while(one.isFull() && i < requestQueue.pQueue.size()) {
			Request a = requestQueue.pQueue.get(i);
			
			if(a.getCourseNumber() == one.num2) {
				System.out.println("Request Processed");
				System.out.println(a.getStudentName() + " cannot be registered for " + a.getCourseDept() + " " + a.getCourseNumber() + " Course is Full");
				
			}
			
			
			i++;
		}
		
		
		
		}
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