package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
public interface EmployeeService {
    void getEmployeeDetails(Employee emp);  // to input employee details
    void findInsuranceScheme(Employee emp);  // to find insurance scheme
    void displayEmployeeDetails(Employee emp);  // to display employee details
}

