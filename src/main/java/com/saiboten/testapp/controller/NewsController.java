package com.saiboten.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saiboten.testapp.AppConstants;
import com.saiboten.testapp.services.NewsRepository;

@Controller
@RequestMapping("/news.htm")
public class NewsController extends AbstractSimpleAppController {
	
	public static final String CURRENT_VIEW = "news";
	public static final String CURRENT_PAGE = "news.htm";
	
	@Autowired
	protected NewsRepository newsRepo;

	@Override
	public String getCurrentPage() {
		return CURRENT_PAGE;
	}

	@Override
	public String getViewName() {
		return CURRENT_VIEW;
	}

	@Override
	public String redirect(ModelMap model) {
		String rvView = super.redirect(model);
		model.addAttribute(AppConstants.WEB.PAGE_PARAM.NEWS_LIST, newsRepo.findAll());
		return rvView;
	}

}
