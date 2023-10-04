package com.osip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osip.model.Store;
import com.osip.repository.StoreRepository;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreRepository repository;

    @PostMapping("/addStore")
    public String saveStore(@RequestBody Store store) {
    	repository.save(store);
      return "Added Store with id : "+ store.getStoreid();
    }

    @GetMapping("/findAllStore")
    public List<Store> getStore(){
        return repository.findAll();
    }

    @GetMapping("/findAllStore/{id}")
    public Optional<Store> getStore(@PathVariable int id){
        return repository.findById(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteStore(@PathVariable int id) {
        repository.deleteById(id);
        return "Store deleted with id: "+id;
    }

}
