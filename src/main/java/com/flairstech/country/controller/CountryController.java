package com.flairstech.country.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flairstech.country.entity.Country;
import com.flairstech.country.exception.CountryNotFoundException;
import com.flairstech.country.repository.CountryRepository;
import com.flairstech.country.valueobject.CountryVO;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
	
	private final static String COUNTRY_NOT_FOUND_ERROR_MSG="";
	
	@Autowired
	CountryRepository countryRepository;

	@RequestMapping("/")
	public CountryVO getCountry(String countryCode) throws CountryNotFoundException {
		Country country = countryRepository.findByCountryCode(countryCode);
		if (null != country) {
			return new CountryVO(country.getName(), country.getContinent(), country.getPopulation(),
					country.getLifeExpectancy(), country.getCountryLanguage());
		}else {
			throw new CountryNotFoundException(COUNTRY_NOT_FOUND_ERROR_MSG);
		}
	}
}
