package com.main.controllers;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.models.Country;
import com.main.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public String getCountries(Model model) {
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		return "Country";
	}

	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.saveNewCountry(country);
		return "redirect:/countries";
	}

	@RequestMapping(value = "/countries/{id}", method = { RequestMethod.POST, RequestMethod.GET})
	public void findCountryById(@Parameter("id") String id, Model model) {
		int code = Integer.parseInt(id);
		System.out.println(id+ "QUanggggggggggggggggggggg");
		model.addAttribute("country", countryService.getCountryById(code));
	}
}
