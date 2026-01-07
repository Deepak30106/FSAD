package model;

public class employee {

    private int empId;
    private String empName;
    private double salary;
    private String designation;

    public employee(int empId, String empName, double salary, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }
}
