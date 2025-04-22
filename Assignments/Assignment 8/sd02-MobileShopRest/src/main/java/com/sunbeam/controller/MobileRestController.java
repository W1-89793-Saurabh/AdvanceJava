package com.sunbeam.controller;

import java.util.List;

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

import com.sunbeam.entities.Mobile;
import com.sunbeam.services.MobileServices;

@RequestMapping("/mobiles")
@RestController
public class MobileRestController {
	
	@Autowired
	private MobileServices mobileServices;
	
	
	@GetMapping("")	
	public ResponseUtil<?> getAllMobile(){		
		List<Mobile> list = mobileServices.getAllMobile();
		return ResponseUtil.apiSuccess(list);		
	}
	
	
	
	
	@PostMapping("")
	public ResponseUtil<?> AddMobile(@RequestBody Mobile m){
		 int count =mobileServices.addMobile(m);
		 return ResponseUtil.apiSuccess("mobile added");
	}	
	
	
	
	
	
	@PutMapping("")
	public ResponseUtil<?> updateMobile(@RequestBody Mobile m){		
		int count = mobileServices.updateMobile(m);
		return ResponseUtil.apiSuccess("Mobile id updated");				
	}
	
	
	
	
	@PatchMapping("/{id}")	
	public ResponseUtil<?> updatePrice(@PathVariable("id")int id ,@RequestBody Mobile m){
		int count = mobileServices.updatePrice(m.getPrice(),id);
		return ResponseUtil.apiSuccess("mobile updated");		
	}
	
	
	
	@DeleteMapping("/{id}")	
	public ResponseUtil<?> deleteMobile(@PathVariable("id") int id ){
		int count = mobileServices.deleteById(id);
		return ResponseUtil.apiSuccess("Mobile is deleted");
		}
	

}
