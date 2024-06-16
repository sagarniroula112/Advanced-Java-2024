package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

import java.sql.ResultSet;

public class ProductServiceImpl implements ProductService {
	static List<Product> prodList = new ArrayList<>();

	@Override
	public void addProduct(Product p) {
//		prodList.add(p);
//		System.out.println("Add success!! " + prodList.size());
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String sql = "insert into product (name, price, company) values('" + p.getName() + "', '" + p.getPrice() + "', '" + p.getCompany() + "')";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			
			
			Statement stm = con.createStatement();
			
			stm.execute(sql);
			
			System.out.println("Addition success!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteProduct(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String sql = "delete from product where id = '"+ id +"'";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			
			
			Statement stm = con.createStatement();
			
			stm.execute(sql);
			
			System.out.println("Deletion success!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
//		prodList.remove(index);
	}

	@Override
	public List<Product> getAllProducts() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "select * from product";
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("ProductName = " + rs.getString("name"));
				System.out.println("ProductCompany = " + rs.getString("company"));
				System.out.println("ProductPrice = " + rs.getInt("price"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prodList;
		
	}
}
