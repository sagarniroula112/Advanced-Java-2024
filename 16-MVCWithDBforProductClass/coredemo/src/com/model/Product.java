package com.model;

public class Product {
	// pojo class instance variables
	private int id;
	private String name;
	private int price;
	private String company;
	
	// instance methods
	// getters and setters can be easily generated, not typed
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + "]";
	}
}
