package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig {

	@Bean
	public BoxImpl b1() {
		BoxImpl b = new BoxImpl();
		b.setLength(5);
		b.setBreadth(4);
		b.setHeight(3);
		return b;
		
		
	}
	@Bean
	public BoxImpl b2() {
		BoxImpl b = new BoxImpl(10,8,6);
		return b;
	}
}
