package oops;

public class Qn3 {
	/*
	 * Assign and print the roll number, phone number and address of two students having names "Sam" and 
"John" respectively by creating two objects of class 'Student'.
	 */
	
	public static void main(String[] args) {
		Student s[] = new Student[2];
		
		s[0].name = "Sam";
		s[1].name = "John";
		
		s[0].roll_no = 59;
		s[1].roll_no = 60;
		
		s[0].phone = 59;
		s[1].phone = 60;
		
		s[0].address = "Dhapakhel";
		s[1].address = "London";
		
		s[0].getData();
		s[1].getData();
	}
}
