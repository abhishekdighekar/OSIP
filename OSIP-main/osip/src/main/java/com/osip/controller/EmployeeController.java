package com.osip.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osip.model.Employee;
import com.osip.repository.EmployeeRepository;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Added employee with id : "+ employee.getEmployeeId();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findAllEmployees/{id}")
    public Optional<Employee> getEmployee(@PathVariable String id){
        return employeeRepository.findById(id);
    }
    
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee newEmployee) {
        newEmployee.setEmployeeId(id);
        return employeeRepository.save(newEmployee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id) {
    	employeeRepository.deleteById(id);
        return "Employee deleted with id: "+id;
    }
}
