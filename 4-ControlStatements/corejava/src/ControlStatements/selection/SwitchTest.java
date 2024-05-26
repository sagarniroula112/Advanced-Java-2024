package ControlStatements.selection;

import java.util.Scanner;

public class SwitchTest {
	/*
	 * ------ Switch --------
	 * 
	 * syntax:
	 * 	switch(variable){
	 * 
	 * 		case 1:   // 1 can also be a string, character
	 * 			//statements
	 * 			break;
 *  		case 2:
	 * 			//statements
	 * 			break;
	 * 
	 * 		............
	 * 
 *  		case n:
	 * 			//statements
	 * 			break;
	 * 		default:
	 * 			//statements
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day(integer): ");
		int day = sc.nextInt();
		
		switch(day) {
		
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid input!!!");
		}
	}
}
