package com.osip.controller;

import com.osip.entity.Store;
import com.osip.model.GenericResponse;

import com.osip.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<GenericResponse> saveStore(@RequestBody Store store) {
      return storeService.saveStore(store);
    }

    @GetMapping("/{storeId}")
    public ResponseEntity<Store> getStore(@PathVariable("storeId") int storeId){
        return storeService.getStoreById(storeId);
    }

    @GetMapping
    public ResponseEntity<List<Store>> getAllStore(){
        return storeService.getAllStore();
    }

    /*
    @GetMapping("/findAllStore/{id}")
    public Optional<Store> getStore(@PathVariable int id){
        return storeRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStore(@PathVariable int id) {
        storeRepository.deleteById(id);
        return "Store deleted with id: "+id;
    }*/
}
