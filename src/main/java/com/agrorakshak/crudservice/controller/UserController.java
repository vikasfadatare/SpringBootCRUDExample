package com.agrorakshak.crudservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.agrorakshak.crudservice.model.User;
import com.agrorakshak.crudservice.services.IUserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private IUserService _userService;
	
	@GetMapping("/check")
	public String checkController() {
		return "CRUD Application Successfully Running !!";
	}
	
	@GetMapping(value = "/users", consumes = "application/json")
	public ResponseEntity<List<User>> getAllUser() {		
		List<User> _user = _userService.getAllUser();
		return new ResponseEntity<List<User>>(_user, HttpStatus.OK);
	}
	
	@GetMapping(value = "/users/{userid}", consumes = "application/json")
	public ResponseEntity<?> getUserById(@PathVariable("userid") String userid) {		
		Optional<User> _user = _userService.getUserById(userid);		
		return new ResponseEntity<Optional<User>>(_user, HttpStatus.OK);
	}
	
	@PostMapping(value = "/users/add", consumes = "application/json")
	public ResponseEntity<?> createUser(@RequestBody User user){
		User _user = _userService.createUser(user);
		return new ResponseEntity<User>(_user, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/users/delete/{userid}", consumes = "application/json")
	public ResponseEntity<?> deleteUser(@PathVariable("userid") String userid){
		_userService.deleteUser(userid);
		return new ResponseEntity<String>("Records successfully deleted.", HttpStatus.OK);
	}
	
	@PutMapping(value = "/users/update", consumes = "application/json")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		User _user = _userService.updateUser(user);
		return new ResponseEntity<User>(_user, HttpStatus.OK);
	}						
}
