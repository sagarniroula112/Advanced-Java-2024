package ControlStatements.looping;

public class EnhancedForTest {
	/*
	 *  -------- Enhanced For loop/forEach loop ----------
	 *  	# used to read data from collection(array, list, set, map, etc)
	 *  
	 *  	# Syntax
	 *  
	 *  		for(data_type var : collection){
	 *  			// statements
 *  			}
	 *  
	 */
	
	public static void main(String[] args) {
		int data[] = {1, 3, 5, 7, 9, 11, 13, 15};
		int sum = 0;
		for(int x : data) {
			System.out.println(x);
			sum = sum + x;
		}
		System.out.println("Total:" + sum);
 	}
}
