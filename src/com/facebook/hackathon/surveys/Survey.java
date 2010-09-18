package com.facebook.hackathon.surveys;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Survey {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String creator;
	
	@Persistent
	private String description;
	
	@Persistent
	private String publised;
	
	@Persistent
	private String expiry_date;

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublised() {
		return publised;
	}

	public void setPublised(String publised) {
		this.publised = publised;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public Survey(Key id, String creator, String description, String publised,
			String expiry_date) {
		super();
		this.id = id;
		this.creator = creator;
		this.description = description;
		this.publised = publised;
		this.expiry_date = expiry_date;
	}

}
