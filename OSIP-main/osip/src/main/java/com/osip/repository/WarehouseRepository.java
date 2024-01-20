package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Warehouse;

public interface WarehouseRepository extends MongoRepository<Warehouse,String>{

}
