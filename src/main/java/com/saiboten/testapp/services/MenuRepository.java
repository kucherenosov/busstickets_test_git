package com.saiboten.testapp.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.saiboten.testapp.model.MenuItem;


public interface MenuRepository extends CrudRepository<MenuItem, Long>, JpaSpecificationExecutor<MenuItem> {

	@Query("select m from MenuItem m")
	public List<MenuItem> getTopMenu();

}
