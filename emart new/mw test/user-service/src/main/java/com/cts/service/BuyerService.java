package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Buyer;
import com.cts.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
	BuyerRepository repo;

	public void addBuyer(Buyer buyer) {
		repo.save(buyer);
		
	}

}
