package com.proastro.gua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proastro.gua.entities.Master;
import com.proastro.gua.services.StemsService;

/**
 * @author bgudla
 * 
 */
@RestController
public class StemsController {
	
	@Autowired
	StemsService stemsService;

	@GetMapping("/my-stems")
	public Master fetchStems(@RequestParam(name = "date") String date, @RequestParam(name = "month") String month,
			@RequestParam(name = "year") String year) {
		
		return stemsService.fetchStems(date, month, year);
	}
	
}
