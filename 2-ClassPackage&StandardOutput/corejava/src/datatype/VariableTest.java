package datatype;

import java.util.Scanner;

public class VariableTest {
	/*
	 * ----- Variable ------
	 * # use to store data
	 * # data stored for data processing
	 * 
	 * # syntax:
	 * 
	 * 		data_type variable_name
	 * 
	 */
	
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a: ");
		a = sc.nextInt();
		
		System.out.print("Enter value of b: ");
		b = sc.nextInt();
		
		int c = myFunc(a, b);
		System.out.println("Total = " + c);
	}
	
	public static int myFunc(int a, int b) {
		return a+b;
	}
}
