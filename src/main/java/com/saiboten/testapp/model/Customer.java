package com.saiboten.testapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author Oliver Gierke
 */
@Entity
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1838300483928606519L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;
    private String lastname;


    public Long getId() {

        return id;
    }


    public String getFirstname() {

        return firstname;
    }


    public String getLastname() {

        return lastname;
    }


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
    
    
    
}
