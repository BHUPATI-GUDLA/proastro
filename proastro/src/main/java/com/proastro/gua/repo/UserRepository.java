package com.proastro.gua.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proastro.gua.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
