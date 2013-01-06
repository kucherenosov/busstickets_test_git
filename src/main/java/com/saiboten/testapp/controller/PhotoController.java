package com.saiboten.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/photo.htm")
public class PhotoController extends AbstractSimpleAppController{

	public static final String CURRENT_VIEW = "photo";
	public static final String CURRENT_PAGE = "photo.htm";

	@Override
	public String getCurrentPage() {
		return CURRENT_PAGE;
	}

	@Override
	public String getViewName() {
		return CURRENT_VIEW;
	}
}