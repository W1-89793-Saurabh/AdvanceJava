package com.sunbeam;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HttpSender implements Sender{

	@Override
	public void send(double value) {
		System.out.println("Http seneder :"+value);
		
	}

}
