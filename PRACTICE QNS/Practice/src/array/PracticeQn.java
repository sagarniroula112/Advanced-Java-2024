package array;

import java.util.Arrays;
import java.util.Scanner;
// solution optimized
public class PracticeQn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students to be recorded:: ");
		int nos = sc.nextInt();

		String remarks;
		String studentNames[] = new String[nos];
		float totalMarks[] = new float[nos];
		float percent[] = new float[nos];
		Arrays.fill(totalMarks, 0);
		Arrays.fill(percent, 0);
		String subjects[] = { "Science", "Maths", "Computer", "Economics", "Accountancy" };
		float subjectsMarks[][] = new float[nos][5];

		System.out.println();
		System.out.println("------------ FORM -------------");
		for (int i = 0; i < nos; i++) {
			System.out.println();
			System.out.println("******* PROVIDE NEW STUDENT'S DATA HERE... *******");
			System.out.print("Enter student's name: ");
			studentNames[i] = sc.next();
			System.out.println("Enter Science, Maths, Computer, Economics and Accountancy marks:: ");

			for (int j = 0; j < subjects.length; j++) {
				subjectsMarks[i][j] = sc.nextFloat();
			}
		}

		System.out.println();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s %40s%n", "Student's Name", "Report");
		System.out.println();
		System.out.print("                    ");
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%-10s ", subjects[i]);
		}
		System.out.printf("%-12s %-8s %-8s%n", "Total marks", "Percent", "Remarks");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < nos; i++) {
			System.out.print(studentNames[i] + "			");
			for (int k = 0; k < 5; k++) {
				System.out.printf("%-10s ", subjectsMarks[i][k]);
				totalMarks[i] = totalMarks[i] + subjectsMarks[i][k];

			}
			percent[i] = totalMarks[i] / 500 * 100;
			if (percent[i] >= 40) {
				remarks = "Passed";
			} else {
				remarks = "Failed";
			}
			System.out.printf("%-12s %-8s %-8s%n", totalMarks[i], percent[i] + "%", remarks);
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------");
	}
}