package ControlStatements.selection;

import java.util.Scanner;

public class LadderTest {
	/*
	 * ------- else if -------
	 * 
	 * if(condition-1){
	 * 	//statements
	 * }
	 * 
	 * else if(condition-2){
	 * 	//statements
	 * }
	 * 
	 * else if(condition-3){
	 * 	//statements
	 * }
	 * 
	 * else{
	 * 	//statements
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		double marks = sc.nextDouble();
		
		if(marks == 4) {
			System.out.println("A+");
		}
		else if(marks >= 3.6) {
			System.out.println("A");
		}
		else if(marks >= 3.2) {
			System.out.println("B+");
		}
		else if(marks >= 2.8) {
			System.out.println("B");
		}
		else {
			System.out.println("C+ and below!");
		}
	}
}
