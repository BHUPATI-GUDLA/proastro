package com.proastro.gua;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proastro.gua.mail.EmailService;

@SpringBootTest
class ProastroApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private EmailService emailService;
	
	@Test
	void testsendMail() {
		System.out.println("Running inside test method....");
		emailService.sendEmail("kevalborker@gmail.com", "Dummy mail from Bhupati", "Hello saroja this mail i am sending to you by my java project. whenever you see this mail just call me and tell i recived your mail.");
		System.out.println("Mail Send successfully...");
	}

}
