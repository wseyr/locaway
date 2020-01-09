package com.sopra.LocAway.model;

import java.util.List;

public class Booking {
	Long id;
	boolean isValidated;
	Float totalPrice;
	
	User user;
	Accomodation accomodation;
	List<BookedDay> bookedDays;
	List<Contact> contacts;
	
}
