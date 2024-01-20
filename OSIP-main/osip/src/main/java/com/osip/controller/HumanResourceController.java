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

import com.osip.model.HumanResource;
import com.osip.repository.HumanResourceRepository;

@RestController
@RequestMapping("/humanResource")
public class HumanResourceController {

	@Autowired
	private HumanResourceRepository humanResourceRepository;
	
	@PostMapping("/addHumanResource")
	public String addHumanResource(@RequestBody HumanResource humanResource) {
		humanResourceRepository.save(humanResource);
		return "Added account with id : "+ humanResource.getEmployeeId();
	}
	
	@GetMapping("/findAllHumanResource")
	public List<HumanResource> getHumanResource(){
		return humanResourceRepository.findAll();
	}
	
	@GetMapping("/findAllHumanResource/{id}")
	public Optional<HumanResource> getHumanResource(@PathVariable String id){
		return humanResourceRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public HumanResource updateHumanResource(@PathVariable String id, @RequestBody HumanResource newHumanResource) {
		newHumanResource.setEmployeeId(id);
		return humanResourceRepository.save(newHumanResource);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteHumanResource(@PathVariable String id) {
		humanResourceRepository.deleteById(id);
		return "Human Resource deleted with id: "+id;
	}
}
