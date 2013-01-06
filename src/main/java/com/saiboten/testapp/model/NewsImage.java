package com.saiboten.testapp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="news_image")
public class NewsImage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private String mimeType;
	
	
	//http://stackoverflow.com/questions/3677380/proper-hibernate-annotation-for-byte
	@Column(name="image_data")
	//@Type(type="org.hibernate.type.BinaryType")
	@Type(type="org.hibernate.type.PrimitiveByteArrayBlobType")
	//@Lob
	@Basic(fetch=FetchType.LAZY)
	private byte[] imageData;
	
	@ManyToOne
    @JoinColumn(name="news_id", referencedColumnName="id")
	private News newsItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	
	
	
	

}
