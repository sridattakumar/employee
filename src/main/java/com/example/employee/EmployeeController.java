/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;

@RestController
public class EmployeeController{
    EmployeeService employeeservice = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployee(){
        return employeeservice.getEmployee();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeservice.addEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeebyId(@PathVariable("employeeId") int employeeId){
        return employeeservice.getEmployeebyId(employeeId);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateemployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee){
        return employeeservice.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId){
        employeeservice.deleteEmployee(employeeId);   
    }
}