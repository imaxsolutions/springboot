package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.repo.UserRepo;

@RestController()
@RequestMapping(path = "/Users")
public class UserRestService {
	
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/CreateUser/{email}")
	
	public ResponseEntity<String> createUser(@PathVariable("email") String email)	        
	{
		Long id=null;
		userRepo.save(new Users(id,email));
		
		return ResponseEntity.ok()
		        .header("Custom-Header", "foo")
		        .body("UserCreated1");
	}

	@GetMapping("/hello")
	public ResponseEntity<String> getHello()    
	{		
		
		return ResponseEntity.ok()
		        .header("Custom-Header", "foo")
		        .body("Hello");
	}
}
