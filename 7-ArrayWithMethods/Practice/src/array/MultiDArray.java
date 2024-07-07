package array;

import java.util.Scanner;

public class MultiDArray {
	/*
	 * ----------- Multi-dimensional Array ---------
	 * 
	 * 	#syntax:
	 * 	
	 * 		data_type array_name[][] = new data_type[row][col];
	 */
	
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements:: ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("--------- RESULTS ----------");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
	}
}
