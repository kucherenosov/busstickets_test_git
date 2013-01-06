package com.saiboten.testapp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="news")
public class News implements Serializable {
	
	private static final long serialVersionUID = 3864485197837038469L;

	public static final int SHORT_BODY_LENGTH = 150;
	
	public static final String SHORT_BODY_END = "...";


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=512)
	private String title;
	
	@Column(columnDefinition="text")
	private String body;
	
	@OneToMany(mappedBy="newsItem", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<NewsImage> images;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public Set<NewsImage> getImages() {
		return images;
	}

	public void setImages(Set<NewsImage> images) {
		this.images = images;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Transient
	public String getShortBody() {
		int shortLengthBody = 0;
		if(body != null){
			shortLengthBody = body.trim().length() -1 < SHORT_BODY_LENGTH ? body.trim().length() -1 : SHORT_BODY_LENGTH; 
		}
		return body != null ? body.trim().substring(0, shortLengthBody) + SHORT_BODY_END : "";
	}
	
}
