package com.saiboten.testapp.services;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.saiboten.testapp.model.NewsImage;

public interface NewsImageRepository  extends CrudRepository<NewsImage, Long>, JpaSpecificationExecutor<NewsImage>  {
	
	
	
}
