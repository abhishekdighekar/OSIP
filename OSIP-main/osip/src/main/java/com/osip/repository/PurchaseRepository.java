package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Purchase;

public interface PurchaseRepository extends MongoRepository<Purchase,String>{

}
