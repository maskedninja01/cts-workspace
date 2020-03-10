package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Order;
import com.cts.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	public void addOrder(Order order) {
		repo.save(order);
	}
}
