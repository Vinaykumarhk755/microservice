package com.manipal.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CountryModel {

	@Id
	private int id;
	private String countryCode;
	private String countryName;
	
	@Transient
	private CapitalModel capital;
	public CountryModel() {}
	
	
	public CountryModel(int id, String countryCode, String countryName, CapitalModel capital) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.capital = capital;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public CapitalModel getCapital() {
		return capital;
	}
	public void setCapital(CapitalModel capital) {
		this.capital = capital;
	}
	
}
