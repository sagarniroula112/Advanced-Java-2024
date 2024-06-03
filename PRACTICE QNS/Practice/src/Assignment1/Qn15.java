package Assignment1;

import java.util.Scanner;

public class Qn15 {
	/*
	 * Write a program that receives an ASCII code (between 0 – 128) and display its character 
		[example: 97 (input) ->a(output)].
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ASCII code(0-128): ");
		int num = sc.nextInt();
		
		System.out.println((char)num);
	}
}
