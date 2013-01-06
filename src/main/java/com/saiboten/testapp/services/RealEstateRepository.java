package com.saiboten.testapp.services;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.saiboten.testapp.model.RealEstate;

public interface RealEstateRepository extends CrudRepository<RealEstate, Long>, JpaSpecificationExecutor<RealEstate>{

}
