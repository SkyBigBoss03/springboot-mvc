package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		
		System.out.println("aaaaa");
		return "hello";
	}

	public void test(){

	}



	public void test1(){

	}
}
