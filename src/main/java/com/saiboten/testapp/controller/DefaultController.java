package com.saiboten.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saiboten.testapp.model.Customer;
import com.saiboten.testapp.services.CustomerRepository;

@Controller
public class DefaultController {
	
	@Autowired
	CustomerRepository repository;
 
	@RequestMapping("hello")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView("hello");
 
		mav.addObject("hello", "Hello Spring!");
		
		testService();
 
		return mav;
	}
	
	
	public void testService(){
		
		Customer c = new Customer();
		c.setFirstname("Sergey");
		c.setLastname("Kucherenosov");
		
		if(repository != null){
			repository.save(c);
			
			Iterable<Customer> result = repository.findAll();
			int a = 0;
		}
		
		
		
		
	}
 
}