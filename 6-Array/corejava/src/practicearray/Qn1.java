package practicearray;

import java.util.Scanner;

public class Qn1 {
	public static void main(String[] args) {
		//1. WAP to store and print total, avg price of 10 books.
		
		float sum = 0, avg;
		float price[] = new float[10];
		System.out.print("Enter prices of 10 books:: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<price.length;i++) {
			price[i] = sc.nextFloat();
		}
		
		for(int i=0;i<price.length;i++) {
			sum = price[i] + sum;
		}
		
		avg = sum/price.length;
		System.out.println("------- RESULTS ---------");
		System.out.println("TOTAL:: "+sum);
		System.out.println("AVG:: "+avg);
	}
}
