package com.proastro.gua.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proastro.gua.entities.UserRecord;

public interface UserRepository extends JpaRepository<UserRecord, Long> {
	
}