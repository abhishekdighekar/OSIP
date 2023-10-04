package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
