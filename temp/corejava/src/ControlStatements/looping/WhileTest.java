package ControlStatements.looping;

	public class WhileTest {
	/*
	 * ------ while loop --------
	 * 
	 * # syntax:
	 * 		while(condition){
	 * 			//statements		
	 * 		}
	 */
		public static void main(String[] args) {
			int n = 5;
			int factorial = 1;
			
			while(n>1) {
				factorial = factorial * n;
				n--;
			}
			System.out.println("Factorial:: " + factorial);
		}
}
