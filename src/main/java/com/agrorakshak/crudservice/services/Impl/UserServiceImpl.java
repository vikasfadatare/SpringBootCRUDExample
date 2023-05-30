package com.agrorakshak.crudservice.services.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrorakshak.crudservice.model.User;
import com.agrorakshak.crudservice.repositories.UserRepository;
import com.agrorakshak.crudservice.services.IUserService;
import com.agrorakshak.crudservice.utils.Utils;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository _userRepository;

	@Override
	public User createUser(User user) {
		user.setUserid(Utils.generateGUID());
		user.setRegistrationdate(new Date());
		user.setIsactive(true);
		User _user = _userRepository.save(user);
		return _user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> _user = null;
		_user = _userRepository.findAll();				 
		return _user;
	}

	@Override
	public Optional<User> getUserById(String userid) {
		Optional<User> _user = _userRepository.findById(userid);							
		return _user;
	}

	@Override
	public User updateUser(User user) {		
		User retUser = null;
		//Optional<User> _user = _userRepository.findById(user.getUserid());
		User _user = _userRepository.getById(user.getUserid());
		if(_user != null) {
			_user.setUpdateddate(new Date());
			_user.setFirstname(user.getFirstname());
			_user.setLastname(user.getLastname());
			_user.setUsername(user.getUsername());
			_user.setPassword(user.getPassword());
			_user.setPhone(user.getPhone());
			_user.setRole(user.getRole());
			retUser = _userRepository.save(_user);
		}			
					
		return retUser;
	}

	@Override
	public void deleteUser(String userid) {
		Optional<User> _user = _userRepository.findById(userid);
		if(_user.get() != null)
			_userRepository.deleteById(userid);						
	}
	
	

}
