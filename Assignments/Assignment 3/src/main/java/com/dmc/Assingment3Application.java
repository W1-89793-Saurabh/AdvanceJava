package com.dmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assingment3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Assingment3Application.class, args);
	}
	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		TcpSender ts=ctx.getBean(TcpSender.class);
		ts.send(40);
		HttpSender hs=ctx.getBean(HttpSender.class);
		hs.send(0);
		UdpSender Us=ctx.getBean(UdpSender.class);
		Us.send(400);
		Sender sender=ctx.getBean(Sender.class);
		sender.send(2000);

	}

}
