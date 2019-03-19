package com.flairstech.country.repository;

import org.springframework.data.repository.CrudRepository;

import com.flairstech.country.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

	Country findByCountryCode(String countryCode);

}
