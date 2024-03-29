package com.proastro.gua;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proastro.gua.insertScript.InsertScript;

@SpringBootApplication
public class ProastroApplication implements CommandLineRunner {
	
	@Autowired
	InsertScript insertScript;

	public static void main(String[] args) {
		SpringApplication.run(ProastroApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
//		insertScript.storeRecordInStems();
//		insertScript.storeRecordInMaster();
		System.out.println("ALL DATA IS STORED...");
	}

}
