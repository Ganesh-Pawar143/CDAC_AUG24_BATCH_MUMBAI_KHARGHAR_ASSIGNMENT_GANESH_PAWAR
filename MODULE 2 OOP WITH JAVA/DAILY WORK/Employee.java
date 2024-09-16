package org.Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    private int id;
    private String name;
    private double salary;

    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        totalSalaryExpense = totalSalaryExpense-this.salary;
        this.salary = salary;
        totalSalaryExpense += salary;
    }
    public static int getTotalEmployees() {
        return totalEmployees;
    }


    public static void applyRaise(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * (1 + percentage / 100);
            employee.setSalary(newSalary);
        }
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }
    @Override
    public String toString() {
        return String.format("Employee [ID=%d Name=%s Salary=%.2f ]",id,name, salary);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "ABC XYZ", 50000));
        employees.add(new Employee(2, "PQR WXY", 60000));
        employees.add(new Employee(3, "LMN OPQ", 55000));

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());

        System.out.println("\nApplying a 10% raise to all employees...");
        Employee.applyRaise(employees, 10);

        System.out.println("Total Salary Expense after raise: " + Employee.calculateTotalSalaryExpense());

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
