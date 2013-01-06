package com.saiboten.testapp.services;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.saiboten.testapp.model.News;

public interface NewsRepository extends CrudRepository<News, Long>, JpaSpecificationExecutor<News> {
	

}