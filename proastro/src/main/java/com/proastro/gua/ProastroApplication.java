package com.proastro.gua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.proastro.gua.entities.User;
import com.proastro.gua.repo.UserRepository;

@SpringBootApplication
public class ProastroApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProastroApplication.class, args);

		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
		
		User user = new User(1, "Bhupati", "Mumbai", "Active");

		System.out.println(userRepository.save(user).toString());
	}

}
