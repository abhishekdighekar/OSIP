package com.osip.repository;

import com.osip.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ItemRepository extends MongoRepository<Item,String>{

}
