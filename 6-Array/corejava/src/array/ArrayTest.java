package array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		// store and print age of 5 students.
		
			// create array
		int age[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
			// write data in array
		System.out.println("Enter five data:: ");
		for(int i=0;i<age.length;i++) {
			age[i] = sc.nextInt();
		}
			// read data from array
		System.out.println("-------- RESULTS ---------");
		for(int x:age) {
			
			System.out.print(x + " ");
		}
		
		
	}
}
