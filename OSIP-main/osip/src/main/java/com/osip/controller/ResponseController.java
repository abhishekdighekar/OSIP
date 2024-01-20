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

import com.osip.model.Response;
import com.osip.repository.ResponseRepository;

@RestController
@RequestMapping("/response")
public class ResponseController {

	@Autowired
	private ResponseRepository responseRepository;
	
	@PostMapping("/addResponse")
	public String addResponse(@RequestBody Response response) {
		responseRepository.save(response);
		return "Added account with id : "+ response.getResponseId();
	}
	
	@GetMapping("/findAllResponses")
	public List<Response> getResponse(){
		return responseRepository.findAll();
	}
	
	@GetMapping("/findAllResponses/{id}")
	public Optional<Response> getResponse(@PathVariable String id){
		return responseRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Response updateResponse(@PathVariable String id, @RequestBody Response newResponse) {
		newResponse.setResponseId(id);
		return responseRepository.save(newResponse);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteResponse(@PathVariable String id) {
		responseRepository.deleteById(id);
		return "Response deleted with id: "+id;
	}

}
