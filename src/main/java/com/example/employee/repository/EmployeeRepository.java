// Write your code here
package com.example.employee.repository;

import com.example.employee.model.Employee;
import java.util.*;
public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);
    
    void deleteEmployee(int employeeId);
}