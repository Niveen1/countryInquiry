package com.flairstech.country.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flairstech.country.entity.Country;
import com.flairstech.country.repository.CountryRepository;
import com.flairstech.country.valueobject.CountryVO;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
	@Autowired
	CountryRepository countryRepository;

	@RequestMapping("/")
	public CountryVO getCountry(String countryCode) {
		Country country = countryRepository.findByCountryCode(countryCode);
		return new CountryVO(country.getName(), country.getContinent(), country.getPopulation(),
				country.getLifeExpectancy(), country.getCountryLanguage());
	}
}
