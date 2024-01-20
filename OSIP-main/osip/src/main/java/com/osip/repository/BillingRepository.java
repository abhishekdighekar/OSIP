package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Billing;

public interface BillingRepository extends MongoRepository<Billing,String>{

}
