package com.kayaTech.Controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kayaTech.Models.*;
import com.kayaTech.ServisePkg.ServiceClass;

@RestController
public class UserController {
	
	@Autowired
	ServiceClass service;
	@Autowired
	User user;
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		return service.getUsers();
		
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		
		return service.getSingleUser(id);
		
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return service.saveUser(user);
		
	}
	@PostMapping("/users")
	public String addUsers(@RequestBody List<User> user) {
		
		long total = service.saveUsers(user);
		return "TOTAL USERS :"+total;
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User user1, @PathVariable String id) {
		
		return service.saveUpdate(user1, id);
		
	}
	
	@DeleteMapping("/user/{id}")
	public long deleteUser(@PathVariable String id) {
		
		return service.removeUser(id);
		
	}
	
	}
