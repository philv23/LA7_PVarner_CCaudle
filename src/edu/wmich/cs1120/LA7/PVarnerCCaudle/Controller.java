package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController {
	public LinkedList<Course> courses;
	public PriorityQueue<Request> requestQueue;
	public BufferedReader fileIn;
	public BufferedReader fileIn1;
	public ArrayList <String> major = new ArrayList();
	public ArrayList <String> courseNum = new ArrayList();
	public ArrayList <String> cap = new ArrayList();
	
	public ArrayList <String> name = new ArrayList();
	public ArrayList <String> level = new ArrayList();
	public ArrayList <String> studentMajor = new ArrayList();
	public ArrayList <String> department = new ArrayList();
	public ArrayList <String> reqNum = new ArrayList();
	
	public ArrayList <String> inputF = new ArrayList();
	
	
	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, BufferedReader fileIn, BufferedReader fileIn1) {
		this.courses = courses;
		this.requestQueue = requestQueue;
		this.fileIn = fileIn;
		this.fileIn1 = fileIn1;
	}

	@Override
	public void readCourseFile() {
		// TODO Auto-generated method stub
		String[] array = new String[3];
		
		File file = new File(fileIn.toString());
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				array = scanner.nextLine().toString().split(",");
				major.add(array[0]);
				courseNum.add(array[1]);
				cap.add(array[2]);
				scanner.close();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		
	}

	@Override
	public void readRequestFile() {
		String[] array = new String[5];
		
		File file = new File(fileIn.toString());
		int i = 0;
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				array = scanner.nextLine().toString().split(",");
				
				major.add(array[0]);
				courseNum.add(array[1]);
				cap.add(array[2]);
				
				inputF.add(major.get(i)+","+courseNum.get(i)+","+cap.get(i));
				i++;
				scanner.close();
			}
			
			
		} catch (FileNotFoundException e) {
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