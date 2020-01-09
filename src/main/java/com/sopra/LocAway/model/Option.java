package com.sopra.LocAway.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Option {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Boolean isRule;
	
	@ManyToMany
	List<Accomodation> accomodations;
	
	public Option() {
		super();
	}

	public Option(String name, Boolean isRule) {
		super();
		this.name = name;
		this.isRule = isRule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsRule() {
		return isRule;
	}

	public void setIsRule(Boolean isRule) {
		this.isRule = isRule;
	}


	@Override
	public String toString() {
		return "Option [id=" + id + ", name=" + name + ", isRule=" + isRule + "]";
	}
	
}

