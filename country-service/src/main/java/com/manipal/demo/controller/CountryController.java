package com.manipal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.CapitalModel;
import com.manipal.demo.model.CountryModel;
import com.manipal.demo.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;
	
	@Autowired
	private Environment env;

	@GetMapping("/countryname/{countryName}")
	public CountryModel getDetail(@PathVariable String countryName) {
		CountryModel countryModel = service.getCountryDetails(countryName);
		String countryCode = countryModel.getCountryCode();
		CapitalModel model = service.getCapitalDetails(countryCode);
		model.setPort(Integer.parseInt(env.getProperty("server.port")));

		countryModel.setCapital(model);
		return countryModel;	
	}
	
	@PutMapping("/add")
	public CountryModel addCountry(@RequestBody CountryModel model) {
		return service.addCountry(model);
	}

}
