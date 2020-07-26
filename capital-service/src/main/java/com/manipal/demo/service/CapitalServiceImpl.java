package com.manipal.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.manipal.demo.DAO.CapitalDao;
import com.manipal.demo.model.CapitalModel;

@Service
public class CapitalServiceImpl implements CapitalService {

	@Autowired
	private CapitalDao dao;

	@Autowired
	private Environment env;

	@Override
	public String addCapital(CapitalModel capital) {
		return dao.addCapital(capital);
	}

	@Override
	public CapitalModel getByZipcode(String zipcode) {
		CapitalModel model = dao.getByZipcode(zipcode);
		model.setPort(Integer.parseInt(env.getProperty("server.port")));
		return model;
	}

	@Override
	public List<CapitalModel> getCapitals() {
		List<CapitalModel> model = dao.getCapitals();
		for (CapitalModel capital : model) {
			capital.setPort(Integer.parseInt(env.getProperty("server.port")));
		}
		return model;
	}

	@Override
	public CapitalModel getByCountryCode(String countryCode) {
		CapitalModel model = dao.getByCountryCode(countryCode);
		model.setPort(Integer.parseInt(env.getProperty("server.port")));
		return model;
	}

}
