package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Seller;
import com.cts.service.SellerService;

@RestController
@RequestMapping(value = "/seller")
public class SellerController {

	@Autowired
	SellerService service;

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addBuyer(@RequestBody Seller seller) {
		seller.setRole("SELLER");
		seller.setUserName(seller.getEmail());
		service.addSeller(seller);
	}

}
