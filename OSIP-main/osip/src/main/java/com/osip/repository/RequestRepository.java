package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Request;

public interface RequestRepository extends MongoRepository<Request,String>{

}
