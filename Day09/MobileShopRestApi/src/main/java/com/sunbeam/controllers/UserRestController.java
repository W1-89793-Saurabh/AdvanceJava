package com.sunbeam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dtos.ResponseUtil;
import com.sunbeam.entities.User;
import com.sunbeam.repository.UserRepository;

@RequestMapping("/users")
@RestController
public class UserRestController {
	
	@Autowired
	private UserRepository	userDao;
	
	@GetMapping
	public ResponseUtil<?> findAll() {
		List<User> list = userDao.findAll();
		return ResponseUtil.apiSuccess(list);
	}
	
	@PostMapping("/AddUser")
	public ResponseUtil<?> saveUser(@RequestBody User u){
		userDao.save(u);
		return ResponseUtil.apiSuccess("Data Saved.");
	}
	
	@PutMapping("/UpdateUser/{id}")
	public ResponseUtil<?> updateUser(@PathVariable int id, @RequestBody User u1){
		User u1 = userDao.save(u1);
		return ResponseUtil.apiSuccess(u1);	
		}
}














