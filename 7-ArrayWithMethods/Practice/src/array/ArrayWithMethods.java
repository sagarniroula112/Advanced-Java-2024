package array;

import java.util.Arrays;

public class ArrayWithMethods {
//	29 May 2024 Docs Update
	/*
	 * ------------- Array with methods -------------
	 *  a> array as arguments:
	 *  
	 *  	void sum(int a[]){   // size dinu parena
	 *  		// statements
	 *  	}	
	 *  
	 *  b> array as return type:
	 *  
	 *  	int[] getValue(){
	 *  		// statements
	 *  		// array = all the numbers;
	 *  		return array;
	 *  	}
	 */
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		sum(num);
		String[] cities = {"Kathmandu", "Delhi", "Moscow", "Washington", "Dhaka"};
		printCities(cities);
		int[] arr = fetchOddNumbersFrom1To100();
//		for(int i=0;i<50;i++) {
//			System.out.println(arr[i]+ " ");
//		}
		// Instead to print only, do this!!!!!
		System.out.println(Arrays.toString(arr));
	}
	
	// -- Array as the argument --
	static void sum(int values[]) {
		int s = 0;
		for(int x: values) {
			s = s + x;
		}
		System.out.println("SUM :: " + s);
	}
	
	// Practice: Print array of cities
	static void printCities(String cities[]) {
		for(String city: cities) {
			System.out.print(city+" ");
		}
		System.out.println(" ");
	}
	
	// -- Array as a return type --
	static int[] fetchOddNumbersFrom1To100() {
		int oddNums[] = new int[50];
		int j = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				oddNums[j] = i;
				j++;
			}
		}
		return oddNums;
	}
}
