package ControlStatements.selection;

import java.util.Scanner;

public class IfElseTest {
	/*
	 * --------- if-else ---------
	 * 
	 * if(condition){
	 * 
	 * }else{
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n + " is an ever number.");
		}else {
			System.out.println(n + " is an odd number.");
		}
		
	}
}
