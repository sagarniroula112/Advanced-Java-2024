package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductView {
	public static void main(String[] args) {
		addBtn();
		getAll();
		delete();
		
		// show products AFTER DELETED
		
		getAll();
	}
	
	// add product
	static void addBtn() {
		ProductService pService = new ProductServiceImpl();
		
		char flag = 'y';
		Scanner sc = new Scanner(System.in);
		
		do {
			Product p = new Product();
		
			System.out.println("Enter Product ID:: ");
			p.setId(sc.nextInt());
			System.out.println("Enter Product Name:: ");
			p.setName(sc.next());
			System.out.println("Enter Product Company:: ");
			p.setCompany(sc.next());
			System.out.println("Enter Product Price:: ");
			p.setPrice(sc.nextInt());
		
			pService.addProduct(p);
			
			System.out.println("Do you want to add more [y/n]? ");
			flag = sc.next().charAt(0);
		} while(flag == 'y');
	}
	
	// get all products
	static void getAll() {
		ProductService pService = new ProductServiceImpl();
		
		List<Product> pList = pService.getAllProducts();
		
		System.out.println(pList);
	}
	
	static void delete() {
		ProductService pService = new ProductServiceImpl();
		
		pService.deleteProduct(0);
	}
}
