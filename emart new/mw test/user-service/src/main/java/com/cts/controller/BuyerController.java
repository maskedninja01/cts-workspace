package com.cts.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Buyer;
import com.cts.service.BuyerService;

@RestController
@RequestMapping(value = "/buyer")
public class BuyerController {

	@Autowired
	BuyerService service;

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addBuyer(@RequestBody Buyer buyer) {
		buyer.setCreatedDate(new Date().toString());
		buyer.setRole("BUYER");
		buyer.setUserName(buyer.getEmailId());
		service.addBuyer(buyer);
	}

}
