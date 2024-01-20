package com.osip.service;

import java.util.List;

import com.osip.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);

    void updateEmployee(Long id, Employee updatedEmployee);

    void deleteEmployee(Long id);
}
