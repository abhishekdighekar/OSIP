package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Store;

public interface StoreRepository extends MongoRepository<Store, String>{

}
