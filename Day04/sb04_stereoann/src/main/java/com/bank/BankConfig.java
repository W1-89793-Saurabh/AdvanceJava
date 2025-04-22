package com.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sunbeam.bank.Account;
import com.sunbeam.bank.AccountImpl;


//@PropertySource({"file:///D:/bank.properties"})

@ComponentScan("com.bank")
@Configuration
public class BankConfig {
	
	@Bean
	public Account acc() {
		AccountImpl a = new AccountImpl(101, "Saurabh", 40000);
		return a;
	}

}
