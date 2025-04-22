package com.sunbeam;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class UdpSender implements Sender{

	@Override
	public void send(double value) {
		System.out.println("Udp sender"+value);
		
	}

}
