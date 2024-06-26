package ControlStatements.selection;

import java.util.Scanner;

public class ClassPractice2 {
	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter operator: ");
		char op = sc.next().charAt(0);
		sc.close();
		
		switch(op) {
			case '+':
				result = n1 + n2;
				break;
				
			case '-':
				result = n1 - n2;
				break;
				
			case '*':
				result = n1 * n2;
				break;
				
			case '/':
				result = n1 / n2;
				break;
				
			default:
				System.out.println("Error occured!!");
				return;
		}
		System.out.println("Operation result: " + result);
	}
}
