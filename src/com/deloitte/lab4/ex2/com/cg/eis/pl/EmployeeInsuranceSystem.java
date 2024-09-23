package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;


public class EmployeeInsuranceSystem {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Employee emp = new Employee();

        service.getEmployeeDetails(emp);

        service.findInsuranceScheme(emp);

        service.displayEmployeeDetails(emp);
    }
}
