package practicemethods;

import java.util.Scanner;

public class Qn2 {
	/*
	 * Q>  SI and Amount using following methods:
   *      a> input
   *      b> processing
   *      c> output 
	 */
	
	public static void main(String[] args) {
		input();
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal(p):: ");
		double p = sc.nextDouble();
		System.out.print("Enter Time(t):: ");
		double t = sc.nextDouble();
		System.out.print("Enter Rate(r):: ");
		double r = sc.nextDouble();
		
		processing(p, t, r);
	}
	
	static void processing(double p, double t, double r) {
		double si = p * t * r;
		output(si);
	}
	
	static void output(double si) {
		System.out.println("------- RESULTS --------");
		System.out.println("Simple Interest: Rs. " + si);
	}
}
