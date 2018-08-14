package com.shori.TechnologySchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages ="com.shori.TechnologySchool.repo")
@SpringBootApplication
public class PECOnline {

	public static void main(String[] args) {

		SpringApplication.run(PECOnline.class, args);

	}

}
