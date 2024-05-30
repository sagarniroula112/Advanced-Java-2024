package array;

import java.util.Scanner;

public class PracticeQn {
	public static void main(String[] args) {
		String remarks;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students to be recorded:: ");
		int nos = sc.nextInt();
		
		String studentNames[] = new String[nos];
		float totalMarks[] = new float[nos];
		Arrays.fill(totalMarks, 0); 
		String subjects[] = {"Science", "Maths", "Computer", "Economics", "Accountancy"};
		float subjectsMarks[][] = new float[nos][5];
		System.out.println();
		System.out.println("------------ FORM -------------");
		
		for(int i=0;i<nos;i++) {
			System.out.println();
			System.out.println("******* PROVIDE NEW STUDENT'S DATA HERE... *******");
			System.out.print("Enter student's name: ");
			studentNames[i]= sc.next();
			
			for(int j=0;j<subjects.length;j++) {
				subjectsMarks[i][j]= sc.nextFloat();
			}
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s %40s%n", "Student's Name", "Report");
		System.out.println();
		System.out.print("                    ");
		for (int i = 0; i < subjects.length; i++) {
		    System.out.printf("%-10s ", subjects[i]);
		}
		System.out.printf("%-12s %-8s %-8s%n", "Total marks", "Percent", "Remarks");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");

		for (int i=0; i<nos; i++) {
			System.out.print("                    ");
			for(int k=0;k<5;k++) {
				System.out.printf("%-10s ", subjectsMarks[i][k]);
				totalMarks[i]= totalMarks[i] + subjectsMarks[i][k]; 
			}
			System.out.printf("%-12s %-8s %-8s%n", totalMarks[i]);
		}
	}
}