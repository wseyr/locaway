package com.sopra.LocAway.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class CustomPrice {
	
	@Id
	@GeneratedValue
	private Long id;
	private Float basePrice;
	private Float personPrice;
	private Date date;
	
	public CustomPrice() {
		super();
	}

	public CustomPrice(Float basePrice, Float personPrice, Date date) {
		super();
		this.basePrice = basePrice;
		this.personPrice = personPrice;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Float basePrice) {
		this.basePrice = basePrice;
	}

	public Float getPersonPrice() {
		return personPrice;
	}

	public void setPersonPrice(Float personPrice) {
		this.personPrice = personPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CustomPrice [id=" + id + ", basePrice=" + basePrice + ", personPrice=" + personPrice + ", date=" + date
				+ "]";
	}
	
}
