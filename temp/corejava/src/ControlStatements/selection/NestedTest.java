package ControlStatements.selection;

import java.util.Scanner;

public class NestedTest {
/*
 * 
 * ------ Nested if-else --------
 * 
 * 	if(condition-1){
 * 		if(condition-2){
 * 		}
 * 		else{
 * 		}
 * 	}else{
 * 
 * }
 */
	
	public static void main(String[] args) {
		boolean haveVoterID;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nationality: ");
		String citizen = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Do you have Voter ID? ");
		haveVoterID = sc.nextBoolean();

		
		if(citizen.equals("nepali")) {
			if(age>=18) {
				if(haveVoterID) {
				System.out.println("You are eligible to vote!");
				}else {
					System.out.println("You don't have a voter ID!!");
				}
				
			}else {
				System.out.println("You are not eligible to vote!!!!");
			}
			
		}else {
			System.out.println("Invalid citizen!");
		}
	}
}
