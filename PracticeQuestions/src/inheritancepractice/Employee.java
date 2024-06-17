package inheritancepractice;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name= name;
        this.ssn=ssn;
        this.salary = salary;
    }

    public void setName(String name){
        if(name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        this.name = name;
    }

    public void raiseSalary(double increase){
        if(increase<0){
            throw new IllegalArgumentException("Increment can't be negative!");
        }
        this.salary = (increase * this.salary);
//        System.out.println("Increased Salary: " + this.salary);
    }

    public int getEmpId() {
        return empId;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void printEmployee(){
        String formattedSalary = NumberFormat.getCurrencyInstance(Locale.US).format(this.salary);
        System.out.println("ID: " + this.getEmpId());
        System.out.println("Name: " + this.getName());
        System.out.println("SSN: " + this.getSsn());
        System.out.println("Salary: " + formattedSalary);
    }
}
