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

import com.osip.model.Account;
import com.osip.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/addAccount")
	public String addAccount(@RequestBody Account account) {
		accountRepository.save(account);
		return "Added account with id : "+ account.getAccountId();
	}
	
	@GetMapping("/findAllAccounts")
	public List<Account> getAccount(){
		return accountRepository.findAll();
	}
	
	@GetMapping("/findAllAccounts/{id}")
	public Optional<Account> getAccount(@PathVariable String id){
		return accountRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Account updateAccount(@PathVariable String id, @RequestBody Account newAccount) {
		newAccount.setAccountId(id);
		return accountRepository.save(newAccount);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAccount(@PathVariable String id) {
		accountRepository.deleteById(id);
		return "Account deleted with id: "+id;
	}
}
