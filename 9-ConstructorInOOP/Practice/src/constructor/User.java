package constructor;

public class User {
	
	// Instance variables
	String userName;
	String password;
	
	// ------------ Default Constructor -------------
	User(){
		userName = "root";
		password = "1234";
	}
	
	// ----------- Parameterized Constructor ------------
	User(String userName, String password){  // local variables inside brackets
		
			//		this();
		
		
		this.userName = userName;  // userName = userName (causes ambiguity) // calling instance variables
		this.password = password;
		
			//		this.printUser(); // calling instance methods
		
		
		
	}
	
	User(String userName){  // local variables inside brackets
		this.userName = userName; // calling instance variables
	}
	
	/*
	 * # 'this' keyword represents current object
	 * # using 'this' keyword we can call following:
	 * 		a. instance variables
	 * 		b. instance methods
	 * 		c. constructors
	 */
	
	// Constuctor Overloading - create multiple objects with different options
	
	// Instance methods
	void printUser() {
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
	}
	
	// Object class is the root class of Java.
	// Every class has Object as a superclass.
	public static void main(String[] args) {
		
		User u = new User("Pranav", "root");   // new = memory allocate, User() = constructor
		
		User u1, u2, u3;
		u1 = new User();
		
		u1.printUser();
		new User("aa", "3333").printUser();
//		u.printUser();
		
	}
}
