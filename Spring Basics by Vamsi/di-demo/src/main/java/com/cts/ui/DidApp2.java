package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.services.GreetService;
import com.cts.services.GreetServiceEnhancedImpl;

public class DidApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansTwo.xml");
		
		GreetServiceEnhancedImpl gs2 = (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet(" Dipesh"));
		gs2.setGreeting("Vannakam");
		
		GreetServiceEnhancedImpl gs3 = (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet(" Dipesh"));
		
		GreetService gs4 = (GreetService) context.getBean("g3");
		System.out.println(gs4.greet(" Dipesh"));
	}
}