package com.saiboten.testapp.services;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.saiboten.testapp.model.ContactInfo;

public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long>, JpaSpecificationExecutor<ContactInfo> {

}
