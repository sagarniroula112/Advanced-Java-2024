package ControlStatements.selection;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		/*
		 * -------- if -------
		 * # syntax:
		 * 
		 * 	if(condition){
		 * 		// statements
		 * }
		 */
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		salary = sc.nextInt();
		
		if(salary<40000) {
		salary = salary + 9000;
		}
		System.out.println("Total salary = " + salary);
	}
}
