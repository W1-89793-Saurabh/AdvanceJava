package com.sunbeam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondHelloController {
	@GetMapping("/v2/hello")
	public String sayHello() {
		return "Hello, DMC!!";
	}
	@GetMapping("/v2/hi")
	public String sayHi() {
		return "Hi, DMC!!";
	}
	@GetMapping("/v2/bye")
	public String sayBye() {
		return "Bye, DMC!!";
	}
}
