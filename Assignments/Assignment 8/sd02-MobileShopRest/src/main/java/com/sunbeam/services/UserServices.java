package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import com.sunbeam.entities.User;

public interface UserServices {
	
	List<User> getAllUsers();
	
	Optional<User> getUserById(int id);
	
	int addUser(User u);
	
	int updateUser(User u);
	
	int UpdateUserPass(String password,int id);
	
	int DeleteById(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
