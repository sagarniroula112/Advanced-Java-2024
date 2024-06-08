package aggregation;

public class Test {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setColor("Black");
		c.setCompany("Tesla");
		c.setPrice(9800000);
		
		Employee e = new Employee();
		
		e.setId(69);
		e.setName("Sakar");
		e.setSalary(69000);
		e.setCar(c);
		
		System.out.println(e);
		System.out.println("Name: " + e.getName());
		System.out.println("------------ CAR DETAILS -----------");
		System.out.println("Color: " + e.getCar().getColor());
	}
}
