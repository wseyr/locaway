package com.sopra.LocAway.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;

	private boolean isAdmin;
	private String email;
	private String password;
	private String phoneNumber;
	private String firstName;
	private String lastName;

	@OneToMany(mappedBy = "user")
	private List<Review> reviews = new ArrayList<Review>();

	@OneToMany(mappedBy = "user")
	private List<Bookmark> bookmarks = new ArrayList<Bookmark>();

	public User() {
		super();
	}

	public User(boolean isAdmin, String email, String password, String phoneNumber, String firstName, String lastName,
			List<Review> reviews, List<Bookmark> bookmarks) {
		super();
		this.isAdmin = isAdmin;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.reviews = reviews;
		this.bookmarks = bookmarks;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Bookmark> getBookmarks() {
		return bookmarks;
	}

	public void setBookmarks(List<Bookmark> bookmarks) {
		this.bookmarks = bookmarks;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
