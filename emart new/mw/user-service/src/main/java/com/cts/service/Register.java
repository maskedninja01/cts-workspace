package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Buyer;
import com.cts.repository.BuyerRepository;
import com.cts.repository.SellerRepository;

@Service
public class Register {

	@Autowired
	BuyerRepository buyerRepo;
	
	@Autowired
	SellerRepository sellerRepo;
	
	public void addBuyer(Buyer buyer) {
		
	}
}
