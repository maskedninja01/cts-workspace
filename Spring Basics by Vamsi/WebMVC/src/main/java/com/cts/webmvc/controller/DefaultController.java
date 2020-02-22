package com.cts.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	//This directs us to the homepage http://localhost:3000/projectName/home
	@RequestMapping({"","/","/home"})  
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		mv.addObject("pageTitle","Home Page - Welcome All");
		mv.addObject("developers",new String[] {"Yennifer","Geralt","Cirilla"});
		
		return mv;
	}
}
