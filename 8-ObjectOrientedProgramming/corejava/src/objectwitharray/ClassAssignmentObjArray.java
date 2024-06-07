package objectwitharray;

import java.util.Scanner;

public class ClassAssignmentObjArray {
    public static void main(String[] args) {
        Employee emp[] = new Employee[2];
        
        getEmpDetails(emp);
        printEmpDetails(emp);
        
        calcTotalSal(emp);
        printItDept(emp);
        countAdminDept(emp);
        
        countAndPrintByCity(emp, "Seattle");
        calcTotalSalByDept(emp, "Admin");
        findHighestAndLowestSalary(emp);
    }

    private static void printEmpDetails(Employee[] emp) {
        for (Employee x : emp) {
            System.out.println(x);
        }
    }
    
    private static void printItDept(Employee[] emp) {
        for (Employee x : emp) {
            if ("IT".equals(x.getDepartment())) {
                System.out.println(x);
            }
        }
    }
    
    private static void countAdminDept(Employee[] emp) {
        int count = 0;
        for (Employee x : emp) {
            if ("Admin".equals(x.getDepartment())) {
                count++;
            }
        }
        System.out.println("Number of Admin employees: " + count);
    }
    
    private static void calcTotalSal(Employee[] emp) {
        int totalSal = 0;
        for (Employee x : emp) {
            totalSal += x.getSalary();
        }
        System.out.println("Total salary of all employees: " + totalSal);
    }

    private static void countAndPrintByCity(Employee[] emp, String city) {
        int count = 0;
        for (Employee x : emp) {
            if (city.equals(x.getCity())) {
                System.out.println(x);
                count++;
            }
        }
        System.out.println("Number of employees in " + city + ": " + count);
    }

    private static void calcTotalSalByDept(Employee[] emp, String department) {
        int totalSal = 0;
        for (Employee x : emp) {
            if (department.equals(x.getDepartment())) {
                totalSal += x.getSalary();
            }
        }
        System.out.println("Total salary of " + department + " department: " + totalSal);
    }

    private static void findHighestAndLowestSalary(Employee[] emp) {
        if (emp.length == 0) return;
        
        Employee highest = emp[0];
        Employee lowest = emp[0];
        
        for (Employee x : emp) {
            if (x.getSalary() > highest.getSalary()) {
                highest = x;
            }
            if (x.getSalary() < lowest.getSalary()) {
                lowest = x;
            }
        }
        
        System.out.println("Employee with highest salary: " + highest);
        System.out.println("Employee with lowest salary: " + lowest);
    }

    private static void getEmpDetails(Employee[] emp) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < emp.length; i++) {
            Employee e = new Employee();
            
            System.out.println("******* ENTER NEW DATA *******");
            System.out.print("Enter employee ID: ");
            e.setId(Integer.parseInt(sc.nextLine()));
        
            System.out.print("Enter employee name: ");
            e.setName(sc.nextLine());
            
            System.out.print("Enter employee company: ");
            e.setCompany(sc.nextLine());
            
            System.out.print("Enter employee salary: ");
            e.setSalary(Integer.parseInt(sc.nextLine()));
            
            System.out.print("Enter employee department: ");
            e.setDepartment(sc.nextLine());
            
            System.out.print("Enter employee post: ");
            e.setPost(sc.nextLine());
            
            System.out.print("Enter employee city: ");
            e.setCity(sc.nextLine());
            
            emp[i] = e;
        }
        sc.close();
    }
}
