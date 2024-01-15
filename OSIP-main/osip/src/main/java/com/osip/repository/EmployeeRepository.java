package com.osip.repository;

import com.osip.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
