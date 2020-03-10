package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Seller;
import com.cts.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository repo;

	public void addSeller(Seller seller) {
		repo.save(seller);
		
	}

}
