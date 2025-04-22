package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assingment4Que1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Assingment4Que1Application.class, args);
	}
	@Autowired
	private Request request1;

	@Override
	public void run(String... args) throws Exception {
		request1.sendrequest();
		
	}

}
