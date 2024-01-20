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

import com.osip.model.Warehouse;
import com.osip.repository.WarehouseRepository;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

	@Autowired
	private WarehouseRepository warehouseRepository;
	
	@PostMapping("/addWarehouse")
	public String addBilling(@RequestBody Warehouse warehouse) {
		warehouseRepository.save(warehouse);
		return "Added account with id : "+ warehouse.getWarehouseId();
	}
	
	@GetMapping("/findAllWarehouses")
	public List<Warehouse> getWarehouse(){
		return warehouseRepository.findAll();
	}
	
	@GetMapping("/findAllWarehouses/{id}")
	public Optional<Warehouse> getWarehouse(@PathVariable String id){
		return warehouseRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Warehouse updateWarehouse(@PathVariable String id, @RequestBody Warehouse newWarehouse) {
		newWarehouse.setWarehouseId(id);
		return warehouseRepository.save(newWarehouse);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteWarehouse(@PathVariable String id) {
		warehouseRepository.deleteById(id);
		return "Warehouse deleted with id: "+id;
	}

}
