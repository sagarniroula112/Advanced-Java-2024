package inheritancepractice;

public class Manager extends Employee{
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

    public void printEmployee(){
        super.printEmployee();
        System.out.println("DepartmentName: " + this.deptName);
    }
}
