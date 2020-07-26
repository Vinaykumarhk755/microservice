package com.manipal.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manipal.demo.model.CountryModel;
import com.manipal.demo.repository.CountryRepository;

@Component
public class CountryDao {
	
	@Autowired
	private CountryRepository repo;
	
	public CountryModel addCountry(CountryModel model) {
		return repo.save(model);
	}
	
	public CountryModel getCountryDetails(String name) {
		return repo.findByCountryName(name);
	}

}
