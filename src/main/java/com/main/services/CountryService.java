package com.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.models.Country;
import com.main.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private  CountryRepository countryRepository;
	
	// Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//Save new country
	public void saveNewCountry(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> getCountryById(int id) {
		return countryRepository.findById(id);
	}
	
	public void deleteCountry(int id) {
		countryRepository.deleteById(id);
	}
}
