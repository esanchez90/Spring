package com.truper.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.truper.model")
@EnableJpaRepositories(basePackages = "com.truper.repository")
public class ExamenTruperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenTruperApplication.class, args);
	}

}
