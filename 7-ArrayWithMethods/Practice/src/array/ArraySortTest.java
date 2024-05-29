package array;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int data[] = {1,84, 41, 96, 24, 35};
		
		Arrays.sort(data);  // to ascending
		System.out.println(Arrays.toString(data));
		for(int i=data.length-1;i>=0;i--) {   // to descending
			System.out.print(data[i] + " ");
		}
		
		Arrays.fill(data, 500);
		System.out.print(Arrays.toString(data));
		
		Arrays.fill(data, 3, 5, 3);
		System.out.print(Arrays.toString(data));
		
		System.out.print(Arrays.toString(Arrays.copyOf(data, 4)));
		
		System.out.print(Arrays.toString(Arrays.copyOfRange(data, 3, 5)));
	}
}
