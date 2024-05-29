package array;

public class ArrayWithMethods {
//	29 May 2024
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
	}
}
