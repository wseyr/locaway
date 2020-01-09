package com.sopra.LocAway.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PointOfInterest {
	
	@ManyToMany
	@JoinTable
	private List<Accomodation> accomodations; 
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private String number;
	private String street;
	private String city;
	private String country;
	
	public PointOfInterest() {
		super();
	}

	public PointOfInterest(String name, String description, String number, String street, String city, String country) {
		super();
		this.name = name;
		this.description = description;
		this.number = number;
		this.street = street;
		this.city = city;
		this.country = country;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PointOfInterest [id=" + id + ", name=" + name + ", description=" + description + ", number=" + number
				+ ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
	
	
	}
