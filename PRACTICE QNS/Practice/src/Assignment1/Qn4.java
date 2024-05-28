package Assignment1;

import java.util.Scanner;

public class Qn4 {
	/*
	 * Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p, t, r;
		System.out.println("Enter p,t,r:: ");
		p = sc.nextFloat();
		t = sc.nextFloat();
		r = sc.nextFloat();
		float si = p*t*r;
		System.out.println("SI::  Rs. " + si);
	}
}
