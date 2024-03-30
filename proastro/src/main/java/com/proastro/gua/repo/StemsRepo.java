package com.proastro.gua.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proastro.gua.entities.Stems;

/**
 * @author bgudla
 * 
 */
public interface StemsRepo extends JpaRepository<Stems, Long> {

	@Query("SELECT s FROM Stems s WHERE s.branch = ?1")
	Stems fetchStem(String dateBranch);

}
