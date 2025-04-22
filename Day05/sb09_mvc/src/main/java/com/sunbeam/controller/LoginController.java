package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunbeam.entity.Customer;
import com.sunbeam.model.Credentials;
import com.sunbeam.service.CustomerService;

@Controller
public class LoginController {
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping("/login")
	public String authenticate(Credentials cr, Model model) {
		Customer cust = custService.authenticateCustomer(cr);
		if(cust != null)
			//model.addAttribute("message", "Login Successful: " + cust.getName());
			return "subjects"; // /subjects.jsp
		else
			model.addAttribute("message", "Login Failed.");
		return "welcome"; // /welcome.jsp
		
		
	}
}
