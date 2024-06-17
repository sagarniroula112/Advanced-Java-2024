package inheritancepractice;

public class Engineer extends Employee{

    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }

    public void printEmployee(){
        super.printEmployee();
        System.out.println("Additional Employee Details HERE!!");
    }
}
