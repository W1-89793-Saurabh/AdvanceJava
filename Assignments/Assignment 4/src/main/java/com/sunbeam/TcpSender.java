package com.sunbeam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TcpSender implements Sender{

	@Override
	public void send(double value) {
		System.out.println("Tcpsender :"+value);
		
	}

}
