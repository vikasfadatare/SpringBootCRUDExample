package com.agrorakshak.crudservice.services;

import java.util.List;
import java.util.Optional;

import com.agrorakshak.crudservice.model.User;

public interface IUserService {
	User createUser(User user);
	List<User> getAllUser();
	Optional<User> getUserById(String userid);
	User updateUser(User user);
	void deleteUser(String userid);	
}
