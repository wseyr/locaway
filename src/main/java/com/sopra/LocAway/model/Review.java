package com.sopra.LocAway.model;

public class Review {
	private String text;
	private int grade;

	public Review() {
		super();
	}

	public Review(String text, int grade) {
		super();
		this.text = text;
		this.grade = grade;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
