package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
