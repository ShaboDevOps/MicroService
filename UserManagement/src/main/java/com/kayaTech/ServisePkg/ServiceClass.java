package com.kayaTech.ServisePkg;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kayaTech.Models.*;
import com.kayaTech.Repostory.UserRepo;

@Component
public class ServiceClass {

	@Autowired
	UserRepo userRepo;
	public List<User> getUsers() {
     return userRepo.findAll();
	}

	public Optional<User> getSingleUser(String id) {
		
		
		return userRepo.findById(id);
	}

	public User saveUser(User user) {
		
		return userRepo.saveAndFlush(user);
	}

	public User saveUpdate(User user, String id) {
		userRepo.deleteById(id);
		userRepo.saveAndFlush(user);
		
		return null;
	}

	public long removeUser(String id) {
		
        userRepo.deleteById(id);
		return userRepo.count();
	}

	public long saveUsers(List<User> users) {
		
		userRepo.saveAll(users);
		return userRepo.count();
	}

}
