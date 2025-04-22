package com.dmc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Primary
	@Bean
	public Sender TcpSend() {
		return new TcpSender();
	}
	@Bean
	public Sender HttpSend() {
		return new HttpSender();
	}
	@Bean
	public Sender UdpSend() {
		return new UdpSender();
	}
	
}
