package com.flairstech.country.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String countryCode;
	private String name;
	private String continent;
	private long population;
	private int lifeExpectancy;
	private String countryLanguage;

	public Country() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
