package com.service;

import java.util.List;

import com.model.Product; // different package vitra xa vane import garne

public interface ProductService {
	void addProduct(Product p);
	void deleteProduct(int index);
	void updateProduct(Product p);
	List<Product> searchProduct(String sdata);
	List<Product> getAllProducts();
}
