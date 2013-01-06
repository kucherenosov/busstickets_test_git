package com.saiboten.testapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="menu")
public class MenuItem implements Serializable{
	
	private static final long serialVersionUID = -8237692724456209705L;

	@Id
	private Long id;
	
	@Column
	private String link;
	
	@Column
	private String label;
	
	
	public MenuItem() {
		super();
	}
	
	public MenuItem(String link, String label) {
		super();
		this.link = link;
		this.label = label;
	}
	
	public MenuItem(Long id, String link, String label) {
		super();
		this.id = id;
		this.link = link;
		this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
