package Assignment1;

import java.util.Scanner;

public class Qn7 {
	/*
	 * Write a program that read the radius and length of a cylinder and computes volume.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cylinder:: ");
		float r = sc.nextFloat();
		System.out.println("Enter length of cylinder:: ");
		float h = sc.nextFloat();
		
		float volume = (float) (3.14 * r * r * h);
		System.out.println("Volume is: " + volume);
	}
}
