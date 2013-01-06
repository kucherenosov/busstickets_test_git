package com.saiboten.testapp.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.saiboten.testapp.model.MenuItem;
import com.saiboten.testapp.services.MenuRepository;


//@Component(value = "menuRepo")
public class FakeMenuItemRepo /*implements MenuRepository */{
	
	public List<MenuItem> getTopMenu() {
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem("welcome.htm","Home"));
		items.add(new MenuItem("services.htm","Services"));
		items.add(new MenuItem("photo.htm","Photo"));
		items.add(new MenuItem("news.htm","News"));
		items.add(new MenuItem("about.htm","Contacts/about"));
		return items;
	}

}
