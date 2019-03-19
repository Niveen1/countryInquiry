package com.flairstech.country.valueobject;

public class CountryVO {

	private String name;
	private String continent;
	private long population;
	private int lifeExpectancy;
	private String countryLanguage;

	public CountryVO() {
	}

	public CountryVO(String name, String continent, long population, int lifeExpectancy, String countryLanguage) {
		super();
		this.name = name;
		this.continent = continent;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.countryLanguage = countryLanguage;
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

}
