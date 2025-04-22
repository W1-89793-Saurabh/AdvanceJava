package com.dmc;
public class TcpSender implements Sender{
	@Override
	public void send(double value) {
		System.out.println("TcpSender :"+value);
		
	}

}
