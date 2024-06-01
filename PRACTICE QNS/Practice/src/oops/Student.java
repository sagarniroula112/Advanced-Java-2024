package oops;

public class Student {
	/*
	 * 2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
	 * Assign the value 
		of roll_no as '2' and that of name as "John" by creating an object of the class Student
		
		3. Assign and print the roll number, phone number and address of two students having names "Sam" and 
"John" respectively by creating two objects of class 'Student'.
	 */
	
	// Qn. 2
//	String name;
//	int roll_no;
//	
//	void printStuData(){
//		System.out.println("Name: " + name);
//		System.out.println("Roll: " + roll_no);
//	}
	
	// Qn. 3
	String name;
	int roll_no;
	long phone;
	String address;
	
	void getData(){
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll_no);
		System.out.println("Phone number: " + phone);
		System.out.println("Address: " + address);
	}
}
