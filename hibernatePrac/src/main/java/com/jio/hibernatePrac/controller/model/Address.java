package com.jio.hibernatePrac.controller.model;

import jakarta.persistence.Embeddable;

@Embeddable
public	class Address {

	private String state;

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String city;
}
