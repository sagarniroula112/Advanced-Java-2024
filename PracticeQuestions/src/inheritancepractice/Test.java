package inheritancepractice;

public class Test {
    
    public static void main(String[] args) {
        Employee e1 = new Engineer(69, "Sagar", "hehehe", 50);
        e1.raiseSalary(1.2);
        e1.printEmployee();

        System.out.println();
        Employee e2 = new Manager(123, "Ramesh", "02-04-22334", 556621.21, "Electronics");
        e2.printEmployee();

        System.out.println();
        Employee e3 = new Admin(55, "Bill Munroe", "108-23-6509", 75002.34);
        e3.printEmployee();

        System.out.println();
        Employee e4 = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Civil", 8004123.2);
        e4.printEmployee();
    }
}
