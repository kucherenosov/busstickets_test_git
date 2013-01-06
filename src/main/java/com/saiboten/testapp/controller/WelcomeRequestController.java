package com.saiboten.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@RequestMapping("/welcome.htm")
@SessionAttributes("topMenu")
public class WelcomeRequestController extends AbstractSimpleAppController {
	
	public static final String CURRENT_VIEW = "welcome";
	public static final String CURRENT_PAGE = "welcome.htm";
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(ModelMap model) {
		setCurentActivePage(model);
		model.addAttribute("topMenu", menuRepo.getTopMenu());
		return "welcome";
	}
	*/


	@Override
	public String getCurrentPage() {
		return CURRENT_PAGE;
	}

	@Override
	public String getViewName() {
		return CURRENT_VIEW;
	}

	

}
