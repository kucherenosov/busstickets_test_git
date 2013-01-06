package com.saiboten.testapp.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saiboten.testapp.model.City;
import com.saiboten.testapp.model.LocalizedString;
import com.saiboten.testapp.model.RealEstate;
import com.saiboten.testapp.services.RealEstateRepository;

@Controller
@RequestMapping("/services.htm")
public class ServicesController extends AbstractSimpleAppController {
	
	public static final String CURRENT_VIEW = "services";
	public static final String CURRENT_PAGE = "services.htm";
	
	@Autowired
	private RealEstateRepository realEstateRepository; 
	

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
		
		testWriteRealEstate();
		testReadRealEstate();
		
		return super.redirect(model);
	}
	
	
	public void testWriteRealEstate(){
		RealEstate realEstate = new RealEstate();
		realEstate.setTitle("2 bedrooms flat");
		//cty
		City city = new City();
		Map<String, LocalizedString>  cityLocales = new HashMap<String, LocalizedString>();
		cityLocales.put("en", new LocalizedString("en", "Donetsk"));
		city.setNames(cityLocales);
		//set city to realEstate
		realEstate.setCity(city);
		
		realEstateRepository.save(realEstate);
		
		
		
	} 
	
	public void testReadRealEstate(){
		Iterable<RealEstate> realEstates = realEstateRepository.findAll();
		for (Iterator iterator = realEstates.iterator(); iterator.hasNext();) {
			RealEstate realEstate = (RealEstate) iterator.next();
			System.out.println("Title: " + realEstate.getTitle());
			System.out.println("City name: " + realEstate.getCity().getNames().get("en").getText());
			System.out.println("------------------------------------------------------------------");
		}
		int a = 0;
	}

}
