package com.example.demo;

public class Address {
	String city;
	String state;
	int zip;
	
	
	public Address() {
		
	}
	public Address(String city, String state, int zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	
	


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
}
