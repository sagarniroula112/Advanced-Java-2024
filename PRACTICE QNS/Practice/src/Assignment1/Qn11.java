package Assignment1;

public class Qn11 {
	/*
	 * Write a program to swap two numbers
	 * a) using temp variable
	 * b) without using temp variable
	 */
	public static void main(String[] args) {

		// using temp variable
		int a = 4;
		int b = 7;
		int temp;
		System.out.println("Before: " + "a = " + a + " b = " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After: " + "a = " + a + " b = " + b);

		// without using temp variable
		int x = 2;
		int y = 3;

		swap(x, y);
	}

	static void swap(int x, int y) {
		System.out.println("Before: " + "x = " + x + " y = " + y);
		x = x + y; // 5
		y = x - y; // 2
		x = x - y; // 3

		System.out.println("After: " + "x = " + x + " y = " + y);
	}
}
