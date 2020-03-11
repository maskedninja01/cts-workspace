package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.Payment;
import com.cts.emart.service.PaymentService;

@RestController
@CrossOrigin(origins="http://localhost:4202")
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentService service;

	
	List<Payment> getAllUsers() {
		return service.getAllTransactions();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/payments")
	void addPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	}
	
	@RequestMapping("/payments/{id}")
	Optional<Payment> getUserDetailsById(@PathVariable int id) {
		return service.getUserDetailsById(id);
	}
}
