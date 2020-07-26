package com.manipal.demo.service;

import java.util.List;


import com.manipal.demo.model.CapitalModel;

public interface CapitalService {
	String addCapital(CapitalModel capital);
	CapitalModel getByZipcode(String zipCode);
	List<CapitalModel> getCapitals();
	CapitalModel getByCountryCode(String countryCode);

}
