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

import com.osip.model.Billing;
import com.osip.repository.BillingRepository;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@Autowired
	private BillingRepository billingRepository;
	
	@PostMapping("/addBilling")
	public String addBilling(@RequestBody Billing billing) {
		billingRepository.save(billing);
		return "Added account with id : "+ billing.getBillId();
	}
	
	@GetMapping("/findAllBillings")
	public List<Billing> getBilling(){
		return billingRepository.findAll();
	}
	
	@GetMapping("/findAllBillings/{id}")
	public Optional<Billing> getBilling(@PathVariable String id){
		return billingRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Billing updateBilling(@PathVariable String id, @RequestBody Billing newBilling) {
		newBilling.setBillId(id);
		return billingRepository.save(newBilling);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBilling(@PathVariable String id) {
		billingRepository.deleteById(id);
		return "Billing deleted with id: "+id;
	}

}
