package com.reverside.phonebook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "street_one")
	private String streetOne;
	@Column(name = "street_two")
	private String streetTwo;
	private String city;
	private String province;
	private String country;
	
	@ManyToOne
	private Entry entry;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet1() {
		return streetOne;
	}
	public void setStreet1(String street1) {
		this.streetOne = street1;
	}
	public String getStreet2() {
		return streetTwo;
	}
	public void setStreet2(String street2) {
		this.streetTwo = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Entry getEntry() {
		return entry;
	}
	public void setEntry(Entry entry) {
		this.entry = entry;
	}
	
	
}
