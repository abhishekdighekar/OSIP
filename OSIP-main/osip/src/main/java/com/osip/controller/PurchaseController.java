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

import com.osip.model.Purchase;
import com.osip.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@PostMapping("/addPurchase")
	public String addPurchase(@RequestBody Purchase purchase) {
		purchaseRepository.save(purchase);
		return "Added account with id : "+ purchase.getPurchaseOrderId();
	}
	
	@GetMapping("/findAllPurchases")
	public List<Purchase> getPurchase(){
		return purchaseRepository.findAll();
	}
	
	@GetMapping("/findAllPurchases/{id}")
	public Optional<Purchase> getPurchase(@PathVariable String id){
		return purchaseRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Purchase updatePurchase(@PathVariable String id, @RequestBody Purchase newPurchase) {
		newPurchase.setPurchaseOrderId(id);
		return purchaseRepository.save(newPurchase);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePurchase(@PathVariable String id) {
		purchaseRepository.deleteById(id);
		return "Purchase deleted with id: "+id;
	}
}
