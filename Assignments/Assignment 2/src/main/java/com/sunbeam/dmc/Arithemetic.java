package com.sunbeam.dmc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Arithemetic {
	@Bean
	public Calculate C() {
		Calculate C=new Calculate(22,7);
		return C;
	}
}
