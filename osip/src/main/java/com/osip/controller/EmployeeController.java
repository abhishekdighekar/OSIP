package com.osip.controller;
import java.util.List;
import java.util.Optional;

import com.osip.model.Employee;
import com.osip.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.osip.model.Employee;
import com.osip.repository.EmployeeRepository;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Added employee with id : "+ employee.getEmployeeId();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    @GetMapping("/findAllEmployees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        repository.deleteById(id);
        return "Employee deleted with id: "+id;
    }
}
