// Write your code here
package com.example.employee;

import java.util.*;

public interface EmployeeRepository{
    ArrayList<Employee> getEmployee();
    Employee addEmployee(Employee employee);
    Employee getEmployeebyId(int employeeId);
    Employee updateEmployee(int employeeId, Employee employee);
    void deleteEmployee(int employeeId);
}