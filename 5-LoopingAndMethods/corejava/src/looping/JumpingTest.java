package ControlStatements.looping;

public class JumpingTest {
	/*
	 *  --------- Jumping -------
	 *  
	 *  a> break (must have loop)  => exit from loop
	 *  b> continue (must have loop)  => skip values
	 *  c> return (focuses on method)  => exit from method
	 * 
	 */
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i == 5) {
				return;   // exit from main method (goes to JVM)
			}
			System.out.println(i);
		}
		System.out.println("End for loop....");
	}
}
