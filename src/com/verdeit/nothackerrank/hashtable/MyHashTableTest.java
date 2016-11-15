package com.verdeit.nothackerrank.hashtable;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class MyHashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer,String> studentTable = new Hashtable<Integer, String>();
		Enumeration info;
		int allInfo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("More Info? (Quit) to quit");
		String nextInfo = scanner.next();
		while(!nextInfo.equals("Quit")){
			Student student = new Student();
			System.out.println("Next Student Id");
			int sId = scanner.nextInt();
			System.out.println("Next Student Name");
			String sName = scanner.next();
			student.setStudentId(sId);
			student.setStudentName(sName);
			studentTable.put(student.getStudentId(), student.getStudentName());

			System.out.println("More Info? (Quit) to quit");
			nextInfo = scanner.next();

		}

		if(!studentTable.isEmpty()){
			info = studentTable.keys();
			Iterator it = studentTable.keySet().iterator();
			while(it.hasNext()){
				allInfo = (int) info.nextElement();
				System.out.println("Student Id: " + allInfo + " Name: " + studentTable.get(allInfo));
			}
		}
		else
			System.out.println("No information provided!");

	}

}
