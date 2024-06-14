package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListAssignment {
	public static void main(String[] args) {
		
//		Qn. 1> List of Employee
		
		List<String> emps = new ArrayList<>();
		char qn = 'y';
		String empName;
		Scanner sc = new Scanner(System.in);
		
		while(qn != 'n') {
			System.out.println("Enter employee name:: ");
			empName = sc.nextLine();
			
			emps.add(empName);
			
			System.out.println("Type 'n' to stop, or press any to continue: ");
			String temp = sc.next();
			qn = temp.charAt(0);
			sc.nextLine();
		}
		
		for(String s:emps) {
			System.out.println(s);
		}
		
//		Qn. 2> List of Dog
		
		List<String> dogList = new LinkedList<>();
		
		dogList.add("German Shepherd");
		dogList.add("Pomeranian");
		
		for(String x: dogList) {
			System.out.println(x);
		}
	}
	
	
}
