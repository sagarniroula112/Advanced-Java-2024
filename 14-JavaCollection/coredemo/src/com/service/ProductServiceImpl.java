package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	static List<Product> prodList = new ArrayList<>();

	@Override
	public void addProduct(Product p) {
//		prodList.add(p);
//		System.out.println("Add success!! " + prodList.size());
		
		String sql = "insert into product (name) values('" + p.getName() +"')";
	}

	@Override
	public void deleteProduct(int index) {
		prodList.remove(index);
	}

	@Override
	public List<Product> getAllProducts() {
		return prodList;
	}
	
}
