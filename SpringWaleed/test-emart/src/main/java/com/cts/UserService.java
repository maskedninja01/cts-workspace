package com.cts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public List<User> getAllUsers(){
		return (List<User>)repo.findAll();
	}

	public void addUser(User user) {
		repo.save(user);
	}
	
	public void deleteUser(int id) {
		repo.deleteById(id);
	}

	public Optional<User> getUserById(int id) {
		return repo.findById(id);
		
	}
}
