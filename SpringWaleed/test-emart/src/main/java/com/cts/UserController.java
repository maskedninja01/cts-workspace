package com.cts;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api(value = "My emart User Controller", description = "Rest Controller for Users")
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@ApiOperation(
			value = "Get Users",
			produces = "A List of Users",
			notes = "Hit this URL to get All Users"
			)
	@RequestMapping("/users")
	List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	
	@ApiOperation(
			value = "Post User",
			produces = "Posts a User",
			notes = "Hit this URL to set a users"
			)
	@RequestMapping(method = RequestMethod.POST, value="/users")
	void addUser(@RequestBody User user) {
		user.setCreatedDate(new Date().toString());
		System.out.println("date: " + user.getCreatedDate());
		service.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
	
	@RequestMapping("/users/{id}")
	Optional<User> getUser(@PathVariable int id){
		return service.getUserById(id);
	}
}
