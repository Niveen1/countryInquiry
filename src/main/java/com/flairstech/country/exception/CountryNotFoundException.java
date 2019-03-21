package com.flairstech.country.exception;

public class CountryNotFoundException extends Exception {
	public CountryNotFoundException(String userMessage) {
		super(userMessage);
	}
}
