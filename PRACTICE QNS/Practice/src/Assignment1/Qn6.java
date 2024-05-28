package Assignment1;

import java.util.Scanner;

public class Qn6 {
	/*
	 * Write a program to find the perimeter of circle, triangle, and rectangle.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one option: ");
	
		System.out.println("1. Perimeter of circle");
		System.out.println("2. Perimeter of rectangle");
		System.out.println("3. Perimeter of triangle");
		
		System.out.println(" ");
		System.out.print("Enter the option: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1:
			perimeterCircle();
			break;
		
		case 2:
			perimeterRectangle();
			break;
			
		case 3:
			perimeterTriangle();
			break;
			
		default:
			System.out.println("Invalid option chosen!");
		}
	}
	
	static void perimeterCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:: ");
		float r = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for perimeter of circle:: " + 2 * 3.14 * r);
		System.out.println("---------------------------------");
	}
	
	static void perimeterRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth:: ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for perimeter of rectangle:: " + 2 * (l + b));
		System.out.println("---------------------------------");
	}
	
	static void perimeterTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sides:: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.println("---------------------------------");
		System.out.println("Result for perimeter of circle:: " + a+b+c);
		System.out.println("---------------------------------");
	}
}
