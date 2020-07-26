package com.manipal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.CapitalModel;

@Repository
public interface CapitalRepository extends JpaRepository<CapitalModel, Integer> {

	CapitalModel findByZipcode(String zipCode);
	CapitalModel getByCountryCode(String countryCode);
}
