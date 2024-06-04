package constructor;

public class User {
	
	// Instance variables
	String userName;
	String password;
	
	// ------------ Default Constructor -------------
//	User(){
//		userName = "root";
//		password = "1234";
//	}
	
	// ----------- Parameterized Constructor ------------
	User(String un, String pw){  // local variables inside brackets
		userName = un;  // userName = userName (causes ambiguity)
		password = pw;
	}
	
	void printUser() {
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("Pranav", "root");   // new = memory allocate, User() = constructor
		u.printUser();
		
	}
}
