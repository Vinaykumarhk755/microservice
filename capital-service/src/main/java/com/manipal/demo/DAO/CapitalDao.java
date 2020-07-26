package com.manipal.demo.DAO;

import java.util.List;

import com.manipal.demo.model.CapitalModel;

public interface CapitalDao {
	
	String addCapital(CapitalModel capital);
	CapitalModel getByZipcode(String zipcode);
	List<CapitalModel> getCapitals();
	CapitalModel getByCountryCode(String countryCode);
}
