package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Account;

public interface AccountRepository extends MongoRepository<Account,String>{

}
