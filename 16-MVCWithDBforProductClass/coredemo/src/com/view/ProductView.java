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

		//AFTER DELETED

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
		} while (flag == 'y');
	}

	// get all products
	static void getAll() {
		ProductService pService = new ProductServiceImpl();

		List<Product> pList = pService.getAllProducts();

		System.out.println(pList);
	}

	// add new prompt to user for id to delete
	static void delete() {
		Scanner sc = new Scanner(System.in);
		ProductService pService = new ProductServiceImpl();

		System.out.println("Enter ID of product you want to delete:: ");
		int id = sc.nextInt();
		pService.deleteProduct(id);
	}
}
