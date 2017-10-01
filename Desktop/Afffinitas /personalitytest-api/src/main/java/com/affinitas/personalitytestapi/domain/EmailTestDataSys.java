package com.affinitas.personalitytestapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "email_testdata_sys")
public class EmailTestDataSys implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")	
	private Integer Id ;
	
	@Column(name = "Email")
	private String emailId ;
	
	@Column(name = "TAGS")
	private String tags ;

	
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
