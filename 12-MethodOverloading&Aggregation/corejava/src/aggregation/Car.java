package aggregation;

public class Car {
	
	private String color;
	private String company;
	private int price;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
}
