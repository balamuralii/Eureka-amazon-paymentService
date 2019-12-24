package com.springcloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	@Autowired
    Environment environment;
	
	@GetMapping("/payNow/{price}")
	public String paynow(@PathVariable int price) {
		return "payment amount" + price+environment.getProperty("local.server.port");
	}
}
