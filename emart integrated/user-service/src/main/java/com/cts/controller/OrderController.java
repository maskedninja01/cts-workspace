package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Cart;
import com.cts.entities.Order;
import com.cts.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
//	@Autowired
//	private CartService cService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/add{cartId}")
	void addCategory(@RequestBody Order order, @PathVariable Long cartId) {
		order.setCart(new Cart(cartId));
		service.addOrder(order);
	}

}
