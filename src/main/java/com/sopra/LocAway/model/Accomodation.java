package com.sopra.LocAway.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Accomodation {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String number;
	private String street;
	private String city;
	private String country;
	private String description;
	private Integer numberOfRooms;
	private Integer maxPersons;
	private boolean isDeleted;
	@Enumerated(EnumType.STRING)
	private EAccomodationType accomodationType;
	private Float defaultBasePrice;
	private Float defaultPersonPrice;

	@OneToMany(mappedBy = "accomodation")
	private List<CustomPriceDay> customPriceDays;

	@OneToMany(mappedBy = "accomodation")
	private List<Bookmark> bookmarks;

	@OneToMany(mappedBy = "accomodation")
	private List<Review> reviews;

	@OneToMany(mappedBy = "accomodation")
	private List<Photo> photos;

	@OneToMany(mappedBy = "accomodation")
	private List<Booking> bookings;

	@ManyToMany(mappedBy = "accomodations")
	private List<Option> options;

	@ManyToMany(mappedBy = "accomodations")
	private List<PointOfInterest> pointOfInterests;

	@ManyToOne
	private User user;
}
