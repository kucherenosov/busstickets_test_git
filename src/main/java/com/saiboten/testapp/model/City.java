package com.saiboten.testapp.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class City {
	
	@Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @ElementCollection
    @CollectionTable(name = "city_name", joinColumns = @JoinColumn(name = "city_id"))
    @MapKeyColumn(name = "language_map_key")
    @Fetch(FetchMode.JOIN)
    private Map<String, LocalizedString> names = new HashMap<String, LocalizedString>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Map<String, LocalizedString> getNames() {
		return names;
	}

	public void setNames(Map<String, LocalizedString> names) {
		this.names = names;
	}

}
