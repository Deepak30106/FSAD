package main;

import dao.employeedao;
import model.employee;

import java.util.List;

public class mainapp {

    public static void main(String[] args) {

        employeedao dao = new employeedao();

        System.out.println("=== Employees with Salary > 50,000 ===");
        List<employee> employees = dao.getHighSalaryEmployees();

        for (employee e : employees) {
            System.out.println(
                e.getEmpId() + " | " +
                e.getEmpName() + " | " +
                e.getSalary() + " | " +
                e.getDesignation()
            );
        }

        System.out.println("\n=== Average Salary ===");
        System.out.println(dao.getAverageSalary());
    }
}
