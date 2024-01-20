package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.HumanResource;

public interface HumanResourceRepository extends MongoRepository<HumanResource,String>{

}
