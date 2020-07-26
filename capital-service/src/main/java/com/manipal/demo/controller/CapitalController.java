package com.manipal.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.CapitalModel;
import com.manipal.demo.service.CapitalService;

@RestController
@RequestMapping("/capital-service")
public class CapitalController {
	
	@Autowired
	private CapitalService service;
	
	@GetMapping("/zipcode/{zipcode}")
	public CapitalModel getByZipCode(@PathVariable String zipcode) {
		return service.getByZipcode(zipcode);
	}
	@GetMapping("/code/{code}")
	public CapitalModel getByCode(@PathVariable String code) {
		return service.getByCountryCode(code);
	}
	
	@PutMapping("/capital")
	public String addCapital(@RequestBody CapitalModel model) {
		return service.addCapital(model);
	}
	
	@GetMapping
	public List<CapitalModel> getCapitals() {
		return service.getCapitals();
	}
}
