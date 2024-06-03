package oops;

import java.util.Scanner;

public class Average {
	// QN 8
	int num[] = new int[3];
	int sum = 0;
	
	void getNum() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("Enter num:: ");
			num[i] = sc.nextInt();
		}
	}
	
	void calcAvg() {
		for(int i=0;i<3;i++) {
			sum = sum + num[i];
		}
		float avg = (float)sum/3;
		System.out.println("Average is:: " + avg);
	}
}
