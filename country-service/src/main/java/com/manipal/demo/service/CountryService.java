package com.manipal.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


import com.manipal.demo.dao.CountryDao;
import com.manipal.demo.model.CapitalModel;
import com.manipal.demo.model.CountryModel;
import com.manipal.demo.proxy.CapitalProxy;


@Service
public class CountryService {
	
//	private final String CAPITALSERVICEURI = "http://localhost:8000/capital-service/code/{code}";
	 @Autowired
	    private CapitalProxy capitalproxy;
	@Autowired
	private CountryDao dao;
	public CapitalModel getCapitalDetails(String code) {
        CapitalModel capital=capitalproxy.getCapital(code);
       
        return capital;
         }
	
	/*public CapitalModel getCapitalDetails(String code) {
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("code", code);
		ResponseEntity<CapitalModel> responseEntity = new RestTemplate().getForEntity(CAPITALSERVICEURI, CapitalModel.class, uriVariable);
		CapitalModel model =  responseEntity.getBody();
		return model;
	}
	*/
	public CountryModel getCountryDetails(String name) {
		return dao.getCountryDetails(name);
	}
	
	public CountryModel addCountry(CountryModel model) {
		return dao.addCountry(model);
	}

}
