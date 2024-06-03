package Assignment1;

import java.util.Scanner;

public class Qn14 {
	/*
	 * Write a program to relate two integers entered by user using = =or > or < sign.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println(a + " and " + b +" are equal!");
		} else if(a>b) {
			System.out.println(a + " is greater than " + b);
		}else {
			System.out.println(a + " is less than " + b);
		}
	}
}
