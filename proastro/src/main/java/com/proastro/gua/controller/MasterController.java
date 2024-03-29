package com.proastro.gua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.proastro.gua.services.MasterService;

/**
 * @author bgudla
 * 
 */
@RestController
public class MasterController {
	
	@Autowired
	MasterService masterService;
	
	public void fetchMaster() {

		
	}

}
