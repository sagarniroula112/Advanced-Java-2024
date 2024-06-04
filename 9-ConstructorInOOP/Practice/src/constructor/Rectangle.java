package constructor;

public class Rectangle {
	/*
	 * Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by 
	 * creating a class named 'Rectangle' with a method named 'Area' which returns the area and length 
	 * and breadth passed as parameters to its constructor.
	 */
	
	float l, b;
	
	Rectangle(float l, float b){
		System.out.println("Length:: " + l);
		System.out.println("Breadth:: " + b);
		System.out.println("Area:: " + l * b);
		Area();
	}
	
	float Area() {
		
	}
}
