package constructor;

public class Triangle {
	/*
	 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 
	 * units by creating a class named 'Triangle' with constructor having the three sides as its 
	 * parameters.
	 */
	
	// QN 4
	
//	float a=3, b=4, c=5, s;
//	
//	Triangle(){
//		s = (a+b+c)/2;
//		System.out.println("Perimeter:: " + s);
//		System.out.println("Area of triangle is:: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
//	}
	
	// QN 5
	
	float a, b, c, s;
	
	Triangle(float a, float b, float c){
		s = (a+b+c)/2;
		System.out.println("Perimeter:: " + s);
		System.out.println("Area of triangle is:: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}
