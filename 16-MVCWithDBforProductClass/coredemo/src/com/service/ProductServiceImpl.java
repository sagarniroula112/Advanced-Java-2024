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

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			
			String sql = "insert into product (name, company, price) values('" + p.getName() + "', '" + p.getCompany() + "', '" + p.getPrice() + "')";

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
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String sql = "select * from product";
//			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
//
//			Statement stm = con.createStatement();
//			ResultSet rs = stm.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.println("id = " + rs.getInt("id"));
//				System.out.println("ProductName = " + rs.getString("name"));
//				System.out.println("ProductCompany = " + rs.getString("company"));
//				System.out.println("ProductPrice = " + rs.getInt("price"));
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return prodList;
		
		List<Product> plist = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "select * from product";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				// row mapping to object
				Product pd = new Product();
				
				pd.setId(rs.getInt("id"));
				pd.setName(rs.getString("name"));
				pd.setPrice(rs.getInt("price"));
				pd.setCompany(rs.getString("company"));
				
				plist.add(pd);
			}
			} catch(Exception e) {
				e.printStackTrace();
			}
		
	return plist;
		
	}
	@Override
	public void updateProduct(Product p) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			
			String sql = "update product set name = '"+p.getName()+"', company = '"+p.getCompany()+"', price = '"+p.getPrice()+"' where id = '"+p.getId()+"'";

			Statement stm = con.createStatement();
			
			stm.execute(sql);
			
			System.out.println("Addition success!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> searchProduct(String sdata) {
		// TODO Auto-generated method stub
List<Product> plist = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "select * from product where name like '%"+sdata+"%' OR company like '%"+sdata+"%'";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				// row mapping to object
				Product pd = new Product();
				
				pd.setId(rs.getInt("id"));
				pd.setName(rs.getString("name"));
				pd.setPrice(rs.getInt("price"));
				pd.setCompany(rs.getString("company"));
				
				plist.add(pd);
			}
			} catch(Exception e) {
				e.printStackTrace();
			}
		
	return plist;
	}
}
