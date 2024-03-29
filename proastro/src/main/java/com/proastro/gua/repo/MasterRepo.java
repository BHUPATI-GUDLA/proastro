package com.proastro.gua.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proastro.gua.entities.Master;

/**
 * @author bgudla
 * 
 */
public interface MasterRepo extends JpaRepository<Master, Long> {

	@Query("SELECT m FROM Master m WHERE m.date = ?1 and m.month = ?2 ")
	Master findFromDateAndMonth(String date, String month);
}
