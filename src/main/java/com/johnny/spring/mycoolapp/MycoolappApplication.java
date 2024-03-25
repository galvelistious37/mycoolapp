package com.johnny.spring.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Having spring-boot-maven-plugin in pom allows this app to be run from cmd line
 * with the following:
 * cd to app root directory
 * mvn package
 * mvn spring-boot:run
 */
@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
