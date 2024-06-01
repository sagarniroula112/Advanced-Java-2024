package oops;

public class Test {
	public static void main(String[] args) {
		// Book
		Book b = new Book();
		
		b.name = "Maths";
		b.author = "Pranav Neupane";
		b.price = 499;
		b.pages = 650;
		
		b.printBook();
		
//		Book b1 = new Book();
//		
//		System.out.println();
//		b1.name = "Science";
//		b1.author = "Sahayog G.C.";
//		b1.price = 69;
//		b1.pages = 120;
//		
//		b1.printBook();
		
		// Rectangle
		
		Rectangle r = new Rectangle();
		
		r.l = 5;
		r.b = (float)6.5;
		
		r.getArea();
		
	}
}
