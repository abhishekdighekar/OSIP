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

import com.osip.model.Request;
import com.osip.repository.RequestRepository;

@RestController
@RequestMapping("/request")
public class RequestController {

	@Autowired
	private RequestRepository requestRepository;
	
	@PostMapping("/addRequest")
	public String addRequest(@RequestBody Request request) {
		requestRepository.save(request);
		return "Added account with id : "+ request.getRequestId();
	}
	
	@GetMapping("/findAllRequests")
	public List<Request> getRequest(){
		return requestRepository.findAll();
	}
	
	@GetMapping("/findAllRequests/{id}")
	public Optional<Request> getRequest(@PathVariable String id){
		return requestRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Request updateRequest(@PathVariable String id, @RequestBody Request newRequest) {
		newRequest.setRequestId(id);
		return requestRepository.save(newRequest);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRequest(@PathVariable String id) {
		requestRepository.deleteById(id);
		return "Request deleted with id: "+id;
	}

}
