package com.sunbeam.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/V1")
@RestController
public class FirstRestController {
	

	
	@GetMapping("/hello")
	public @ResponseBody String sayHello() {
		return "Hello";
		
	}
	
	@GetMapping("/hi")
	public @ResponseBody String sayHi() {
		return "Hi, DMC!!";
	}
	@GetMapping("/bye")
	public @ResponseBody String sayBye() {
		return "Bye, DMC!!";
	}
}
