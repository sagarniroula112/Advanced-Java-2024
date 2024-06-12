package javacollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetAssignment {
	/*
	 * Set of student
	 * Set of cow
	 * Set of pen
	 */
	
	public static void main(String[] args) {
		Set<String> students = new TreeSet<>();
		
		char qn = 'y';
		String empName;
		Scanner sc = new Scanner(System.in);
		
		while(qn != 'n') {
			System.out.println("Enter student name:: ");
			empName = sc.nextLine();
			
			students.add(empName);
			
			System.out.println("Type 'n' to stop, or press any to continue: ");
			String temp = sc.next();
			qn = temp.charAt(0);
			sc.nextLine();
		}
		for(String s:students) {
			System.out.println(s);
		}
	}
}
