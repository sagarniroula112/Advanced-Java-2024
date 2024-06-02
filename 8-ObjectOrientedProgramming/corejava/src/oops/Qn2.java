package oops;

public class Qn2 {
	/*
	 * Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
	 * Assign the value of roll_no as '2' and that of name as "John" by creating an object of the
	 * class Student.
	 */
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "John";
		s.roll_no = 69;
		
		s.printStuData();
	}
}
