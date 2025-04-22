package com.sunbeam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.entities.User;
import com.sunbeam.services.UserServices;

@RequestMapping("/users")
@RestController
public class UserRestController {

	@Autowired
	private UserServices userservice;

	@GetMapping("")
	public ResponseUtil<?> getAllMobile() 
	{
		List<User> list = userservice.getAllUsers();
		return ResponseUtil.apiSuccess(list);
	}
	
	

	@GetMapping("/{id}")
	public ResponseUtil<?> getUserByid(@PathVariable("id") int id) 
	{
		Optional<User> user = userservice.getUserById(id);
		return ResponseUtil.apiSuccess(user);
	}
	
	
	

	@PostMapping("")
	public ResponseUtil<?> adduser(User u) 
	{
		int count = userservice.addUser(u);
		return ResponseUtil.apiSuccess("user is added");
	}	
	
	

	@PutMapping("")
	public ResponseUtil<?> updateUser(User u)
	{		
		int count = userservice.updateUser(u);
		return ResponseUtil.apiSuccess("user is updated");
	}
	
	
	

	@PatchMapping("/{id}")
	public ResponseUtil<?> updatePassWord(@PathVariable("id") int id, @RequestBody User u)
	{
		int count = userservice.UpdateUserPass(u.getPassword(), id);
		return ResponseUtil.apiSuccess("user pass is updated");
	}


	
	
	
	@DeleteMapping("/{id}")
	public ResponseUtil<?> deleteuserbyid(@PathVariable("id") int id)
	{
		int count = userservice.DeleteById(id);
		return ResponseUtil.apiSuccess("user is deleted");
	}
	
	

}
