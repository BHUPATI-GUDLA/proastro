package com.proastro.gua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proastro.gua.entities.Master;
import com.proastro.gua.repo.MasterRepo;

/**
 * @author bgudla
 * 
 */
@Service
public class StemsService {

	@Autowired
	MasterRepo masterRepo;
	
	public Master fetchStems(String date, String month, String year) {
		return masterRepo.findFromDateAndMonth(date, month);
	}
	
}
