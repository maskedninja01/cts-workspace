package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.services.GreetNoteProvider;
import com.cts.services.GreetService;

public class DidApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansOne.xml");
		GreetService gs = (GreetService) context.getBean("g1");
		System.out.println(gs.greet("Dipesh"));
		
		GreetService gs2 = (GreetService) context.getBean("g2");
		System.out.println(gs2.greet("Dipesh"));
		
		GreetService gs3 = (GreetService) context.getBean("g3");
		System.out.println(gs3.greet("Dipesh"));
		
		GreetService gs4 = (GreetService) context.getBean("g4");
		System.out.println(gs4.greet(" Dipesh"));
	}
}
