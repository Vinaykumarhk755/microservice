package com.manipal.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manipal.demo.model.CountryModel;

public interface CountryRepository extends MongoRepository<CountryModel, Integer> {
	
	CountryModel findByCountryName(String countryName);

}
