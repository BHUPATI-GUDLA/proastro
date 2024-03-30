package com.proastro.gua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proastro.gua.pojo.Response;
import com.proastro.gua.services.MasterService;

/**
 * @author bgudla
 * 
 */
@RestController
public class MasterController {
	
	@Autowired
	MasterService masterService;

	@GetMapping("/my-stems")
	public Response fetchMasterRec(@RequestParam(name = "date") String date, @RequestParam(name = "month") String month,
			@RequestParam(name = "year") String year, @RequestParam(name = "hour") String hour) {
		
		return masterService.fetchMasterRec(date, month, year, hour);
	}

}
