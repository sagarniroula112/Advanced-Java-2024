package objectwitharray;

import java.util.Scanner;

public class ClassAssignmentObjArray {
	/*
	 * Q> WAP to store and print data 
	 *    of 10 Employees(id,name,company,salary,department,post,city):
	 *    
	 *    a> find total salary of employee.
	 *    b> print employees of IT department.
	 *    c> count employees of Admin department.
	 *    d> count and print employees of particular city.
	 *    e> calculate total salary of particular department.
	 *    f> find highest and lowest salary of employee.
	 */
	
	public static void main(String[] args) {
		Employee emp[] = new Employee[10];
		
		getEmpDetails(emp);
		
		printEmpDetails(emp);
		
		calcTotalSal(emp);
		
		printItDept(emp);
		
		countAdminDept(emp);
	}

	private static void printEmpDetails(Employee[] emp) {
		for(Employee x: emp) {
			System.out.println(x);
		}
	}
	
	private static void printItDept(Employee[] emp) {
		for(Employee x: emp) {
			if(x.getDepartment() == "IT") {
				System.out.println(x);
			}
		}
	}
	
	private static void countAdminDept(Employee[] emp) {
		int count = 0;
		for(Employee x: emp) {
			if(x.getDepartment() == "Admin") {
				count++;
			}
		}
		System.out.println("Number of Admin employee:: " + count);
	}
	
	private static void calcTotalSal(Employee[] emp) {
		int totalSal = 0;
		for(Employee x: emp) {
			totalSal = totalSal + x.getSalary();
		}
	}

	private static void getEmpDetails(Employee[] emp) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<emp.length;i++) {
			Employee e = new Employee();
			
			System.out.println("******* ENTER NEW DATA *******");
			System.out.print("Enter employee ID:: ");
			e.setId(Integer.parseInt(sc.nextLine()));
		
			System.out.print("Enter employee name:: ");
			e.setName(sc.nextLine());
			
			System.out.print("Enter employee company:: ");
			e.setCompany(sc.nextLine());
			
			System.out.print("Enter employee salary:: ");
			e.setSalary(Integer.parseInt(sc.nextLine()));
			
			System.out.print("Enter employee department:: ");
			e.setDepartment(sc.nextLine());
			
			System.out.print("Enter employee post:: ");
			e.setPost(sc.nextLine());
			
			System.out.print("Enter employee city:: ");
			e.setCity(sc.nextLine());
			
			emp[i] = e;
		}
	}
}
