package com.saiboten.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.saiboten.testapp.AppConstants;
import com.saiboten.testapp.model.ContactInfo;
import com.saiboten.testapp.model.MenuItem;
import com.saiboten.testapp.services.ContactInfoRepository;

@Controller
@RequestMapping("/about.htm")
//@SessionAttributes(AppConstants.WEB.PAGE_PARAM.CONTACT_INFO)
public class AboutController extends AbstractSimpleAppController {
	
	public static final String CURRENT_VIEW = "about";
	public static final String CURRENT_PAGE = "about.htm";
	
	@Autowired
	private ContactInfoRepository contactInfoRepository;

	@Override
	public String getCurrentPage() {
		return CURRENT_PAGE;
	}

	@Override
	public String getViewName() {
		return CURRENT_VIEW;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String redirect(ModelMap model) {
		ContactInfo contactInfo = new ContactInfo();
		model.addAttribute(AppConstants.WEB.PAGE_PARAM.CONTACT_INFO, contactInfo);
		return super.redirect(model);
	}
	
	
	@ModelAttribute(AppConstants.WEB.PAGE_PARAM.ACTIVE_PAGE)
	protected String getCurentActivePage(ModelMap model){
		return getCurrentPage();
	}
	
	@ModelAttribute(AppConstants.WEB.PAGE_PARAM.TOP_MENU)
	protected List<MenuItem> getTopMenu(ModelMap model){
		return menuRepo.getTopMenu();
	}
	
	 
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute(AppConstants.WEB.PAGE_PARAM.CONTACT_INFO) ContactInfo contactInfo/*, ModelMap model*/ ,BindingResult result, SessionStatus status) {
		contactInfoRepository.save(contactInfo);
		//return super.redirect(model);
		return getViewName();
	}
	
}
