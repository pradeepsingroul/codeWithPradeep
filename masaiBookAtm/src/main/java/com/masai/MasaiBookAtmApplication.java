package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MasaiBookAtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasaiBookAtmApplication.class, args);
	}

}
