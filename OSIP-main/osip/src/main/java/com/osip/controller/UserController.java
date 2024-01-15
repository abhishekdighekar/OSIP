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

import com.osip.model.User;
import com.osip.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userRepository.save(user);
		return "Added user with id : "+ user.getUserId();
	}
	
	@GetMapping("/findAllUsers")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/findAllUsers/{id}")
	public Optional<User> getUser(@PathVariable String id){
		return userRepository.findById(id);
	}
	
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User newUser) {
        newUser.setUserId(id);
        return userRepository.save(newUser);
    }
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		userRepository.deleteById(id);
	}
}
