package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Response;

public interface ResponseRepository extends MongoRepository<Response,String>{

}
