package Assignment1;

import java.util.Scanner;

public class Qn5 {
	/*
	 * Write a program to find the area of circle, rectangle, and triangle
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one option: ");
	
		System.out.println("1. Area of circle");
		System.out.println("2. Area of rectangle");
		System.out.println("3. Area of triangle");
		
		System.out.println(" ");
		System.out.print("Enter the option: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1:
			areaCircle();
			break;
		
		case 2:
			areaRectangle();
			break;
			
		case 3:
			areaTriangle();
			break;
			
		default:
			System.out.println("Invalid option chosen!");
		}
	}
	
	static void areaCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:: ");
		float r = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for area of circle:: " + 3.14 * r * r);
		System.out.println("---------------------------------");
	}
	
	static void areaRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth:: ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for area of rectangle:: " + l * b);
		System.out.println("---------------------------------");
	}
	
	static void areaTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base and height:: ");
		float b = sc.nextFloat();
		float h = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for area of circle:: " + 0.5 * b * h);
		System.out.println("---------------------------------");
	}
}
