package com.dmc;

public class HttpSender implements Sender{

	@Override
	public void send(double value) {
		System.out.println("HttpSender :"+value);
		
	}

}
