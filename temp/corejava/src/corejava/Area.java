package corejava;

public class Area {
	public static void main(String[] args) {
		/*
		 * --------- Access modifiers ---------
		 * a> Public-- Access everywhere (outside package, project as well)
		 * b> Protected-- Access in class, same package and child class in different packages, different
		 * 		package ma jada kheri child class hunuparyo parent ko
		 * c> Default(package private)-- (just eg. int a;) Access in class and same package
		 * d> Private-- Access in class only
		 */
		
		double x = 4.5, y = 3.0;
		double area = x * y;
		System.out.println("Area is: " + area);
		System.out.println("Hello : "+ args[0]);
		System.out.println("Hello : "+ args[1]);
		/* System ko output device ma print garne */
	}
}

