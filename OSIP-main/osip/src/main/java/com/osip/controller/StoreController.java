package com.osip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osip.model.Store;
import com.osip.repository.StoreRepository;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @PostMapping("/addStore")
    public String saveStore(@RequestBody Store store) {
    	storeRepository.save(store);
      return "Added Store with id : "+ store.getStoreid();
    }

    @GetMapping("/findAllStore")
    public List<Store> getStore(){
        return storeRepository.findAll();
    }

    @GetMapping("/findAllStore/{id}")
    public Optional<Store> getStore(@PathVariable String id){
        return storeRepository.findById(id);
    }
    
    @PutMapping("/{id}")
    public Store updateStore(@PathVariable String id, @RequestBody Store newStore) {
        newStore.setStoreId(id);
        return storeRepository.save(newStore);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStore(@PathVariable String id) {
    	storeRepository.deleteById(id);
        return "Store deleted with id: "+id;
    }

}
