package inheritancepractice;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public void setName(String name){
        this.name = name;
    }

    public void raiseSalary(double increase){
        this.salary = (1+(increase/100) * this.salary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
