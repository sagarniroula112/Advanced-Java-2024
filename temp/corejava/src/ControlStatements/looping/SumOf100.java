package ControlStatements.looping;

public class SumOf100 {
	public static void main(String[] args) {
		int esum = 0;
		int osum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2 == 0) {
				esum = esum + i;
			}
			else {
				osum = osum + i;
			}
		}
		System.out.println("Results:: ");
		System.out.println("Sum of odd numbers: " + osum);
		System.out.println("Sum of even numbers: " + esum);
	}
}
