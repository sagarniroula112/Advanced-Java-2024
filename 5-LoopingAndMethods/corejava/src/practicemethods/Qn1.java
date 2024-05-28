package practicemethods;

import java.util.Scanner;

public class Qn1 {
	/*
	 *  Q> Find area and volume as :
   *    a> getArea :
   *       ->  pass l and b as parameters
   *       ->  calculate area
   *       ->  return area
   *       ->  call this method in main
   *       
   *   b> volume :
   *      -> pass area and h as param
   *      -> calculate volume
   *      -> print area
   *      -> print volume
   *      -> call this method in main
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter l, b and h:: ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double area = getArea(l, b);
		
		getVolume(area, h);
	}
	
	static double getArea(double l, double b) {
		return l * b;
	}
	
	static void getVolume(double area, double h) {
		double volume = area * h;
		System.out.println("********** RESULTS **********");
		System.out.println("Area is::  " + area);
		System.out.println("Volume is::  " + volume);
	}
}
