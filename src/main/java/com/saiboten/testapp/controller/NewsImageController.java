package com.saiboten.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saiboten.testapp.model.NewsImage;
import com.saiboten.testapp.services.NewsImageRepository;


@Controller
public class NewsImageController {
	
	@Autowired
	protected NewsImageRepository newsImageRepo;
	
	/*
	@RequestMapping(method = RequestMethod.GET,  value="/newsimage*")
	@ResponseBody
	public byte[] getImage() {
		//NewsImage img = newsImageRepo.findOne(Long.valueOf(id));
		//return img.getImageData();
		return null;
	}
	*/
	
	@RequestMapping(method = RequestMethod.GET, value="/newsimage/{id}")
	@ResponseBody
	public byte[] getImage(@PathVariable int id) {
		NewsImage img = newsImageRepo.findOne(Long.valueOf(id));
		return img.getImageData();
	}
	

	
}
