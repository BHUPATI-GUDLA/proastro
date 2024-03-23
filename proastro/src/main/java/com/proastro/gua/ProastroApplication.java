package com.proastro.gua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.proastro.gua.*")
public class ProastroApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProastroApplication.class, args);

//		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//		
//		User user = new User(1, "Bhupati", "Mumbai", "Active");
//
//		System.out.println(userRepository.save(user).toString());
	}

}
