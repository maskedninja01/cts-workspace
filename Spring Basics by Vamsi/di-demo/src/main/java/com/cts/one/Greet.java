package com.cts.one;

import com.cts.services.GreetService;

public class Greet implements GreetService{
	

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return "Hello "+userName;
	}
}