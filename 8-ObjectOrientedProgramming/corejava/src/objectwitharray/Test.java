package objectwitharray;

import java.util.Scanner;

public class Test {
	// store and print data of 5 products
	
	public static void main(String[] args) {
		// Create array
		Product[] products = getProducts();
		
		// Read data from array
		printProducts(products);
	}

	private static void printProducts(Product[] products) {
		for(Product pd : products) {
			System.out.println(pd);
		}
	}

	private static Product[] getProducts() {
		Product products[] = new Product[5]; 
				
		// Write data in array
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<products.length;i++) {
			Product p = new Product();
			System.out.println("Enter product ID:: ");
			p.setId(sc.nextInt());
			System.out.println("Enter product name:: ");
			p.setName(sc.nextLine());
			System.out.println("Enter product price:: ");
			p.setPrice(sc.nextInt());
			System.out.println("Enter product company:: ");
			p.setCompany(sc.nextLine());
		
			products[i] = p;
		}
		return products;
	}
}
