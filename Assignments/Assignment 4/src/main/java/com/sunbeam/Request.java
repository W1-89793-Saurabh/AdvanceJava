package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Request {
	@Autowired
	private Sender req;
	public void sendrequest() {
		req.send(10);
	}

}
