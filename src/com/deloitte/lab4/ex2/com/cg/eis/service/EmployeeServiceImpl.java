package com.deloitte.lab4.ex2.com.cg.eis.service;
import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getEmployeeDetails(Employee emp) {
        System.out.print("Enter Employee ID: ");
        emp.setId(scanner.nextInt());
        scanner.nextLine();  
        System.out.print("Enter Employee Name: ");
        emp.setName(scanner.nextLine());
        System.out.print("Enter Employee Salary: ");
        emp.setSalary(scanner.nextDouble());
        scanner.nextLine();  
        System.out.print("Enter Employee Designation: ");
        emp.setDesignation(scanner.nextLine());
    }

    @Override
    public void findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();
        String scheme = "";

        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
            scheme = "Platinum";
        } else if (salary > 30000 && salary <= 50000 && designation.equalsIgnoreCase("Senior Developer")) {
            scheme = "Gold";
        } else if (salary > 20000 && salary <= 30000 && designation.equalsIgnoreCase("Developer")) {
            scheme = "Silver";
        } else if (salary <= 20000) {
            scheme = "Bronze";
        } else {
            scheme = "No Scheme";
        }

        emp.setInsuranceScheme(scheme);
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp.toString());
    }
}

