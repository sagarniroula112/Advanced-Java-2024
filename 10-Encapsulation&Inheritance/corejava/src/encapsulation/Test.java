package encapsulation;

public class Test {
	public static void main(String[] args) {
		
		Product pd = new Product();
		
		pd.setId(69);
		pd.setName("Pranav");
		pd.setCompany("Microsoft");
		pd.setPrice(6969);
		
//		Do this!!!
		System.out.println(pd);  // toString use garera output dinxa!
		
//		System.out.println("ID:: " + pd.getId());
//		System.out.println("Name:: " + pd.getName());
//		System.out.println("Company:: " + pd.getCompany());
//		System.out.println("Price:: " + pd.getPrice());
	}
}
