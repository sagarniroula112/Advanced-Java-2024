package practicearray;

public class Qn3 {
	/*
	 * //3.WAP to store and print odd numbers from 1 to 100.
	 */
	public static void main(String[] args) {
		int oddn[] = new int[50];
		int n = 1;
		
		for(int i=0;i<oddn.length;i++) {
			if(n%2 != 0) {
				oddn[i] = n;
			}
			if(n%2 == 0) {
				i--;
			}
			n++;
		}
		
		for(int i=0;i<oddn.length;i++) {
			System.out.print(oddn[i]+" ");
		}
	}
}
