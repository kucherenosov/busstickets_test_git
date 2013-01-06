package com.saiboten.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saiboten.testapp.AppConstants;
import com.saiboten.testapp.services.MenuRepository;


public abstract class AbstractSimpleAppController {
	
	
	@Autowired
	protected MenuRepository menuRepo;
	
	protected void setCurentActivePage(ModelMap model){
		model.addAttribute(AppConstants.WEB.PAGE_PARAM.ACTIVE_PAGE, getCurrentPage());
	}
	
	protected void setTopMenu(ModelMap model){
		model.addAttribute(AppConstants.WEB.PAGE_PARAM.TOP_MENU, menuRepo.getTopMenu());
	}
	
	public abstract String getCurrentPage();
	
	public abstract String getViewName();
	
	
	

	@RequestMapping(method = RequestMethod.GET)
	public String redirect(ModelMap model) {
		
		setCurentActivePage(model);
		setTopMenu(model);
		//model.addAttribute("topMenu", menuRepo.getTopMenu());
		return getViewName();
	}

}
