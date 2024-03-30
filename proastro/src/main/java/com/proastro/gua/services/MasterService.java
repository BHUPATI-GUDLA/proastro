package com.proastro.gua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proastro.gua.entities.Master;
import com.proastro.gua.entities.Stems;
import com.proastro.gua.pojo.Response;
import com.proastro.gua.repo.MasterRepo;
import com.proastro.gua.repo.StemsRepo;
import com.proastro.gua.utils.StemsUtils;

/**
 * @author bgudla
 * 
 */
@Service
public class MasterService {
	
	@Autowired
	MasterRepo masterRepo;
	
	@Autowired
	StemsRepo stemsRepo;
	
	@Autowired
	StemsUtils utils;
	
	public Response fetchMasterRec(String date, String month, String year, String hour) {
		
		Master master =  masterRepo.findFromDateAndMonth(date, month);
		Stems stems = stemsRepo.fetchStem(master.getDateStem());
		
		return createResponse(master, stems, hour);
	}
	
	public Response createResponse(Master master, Stems stems, String hour) {

		String branch = utils.getHourBranch(hour);
		String stem = utils.getHourStem(hour, stems);
		
		Response response = new Response(master.getYear(), master.getMonth(), master.getDate(), master.getYearStem(),
				master.getYearBranch(), master.getMonthStem(), master.getMonthBranch(), master.getDateStem(),
				master.getDateBranch(), master.getDay(), hour, stem, branch);

		return response;
	}

}


