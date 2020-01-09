package com.sopra.LocAway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
public class Photo {
	@Id
	@GeneratedValue
private Long id;
private String path;
private boolean isMainPhoto;

@ManyToOne
@JoinColumn
private Accomodation accomodation;
}
