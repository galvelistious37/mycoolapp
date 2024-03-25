package com.johnny.spring.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Having spring-boot-maven-plugin in pom allows this app to be run from cmd line
 * with the following:
 * cd to app root directory
 * mvn package
 * mvn spring-boot:run
 *
 * Development Process:
 * 	1 - Apply IntelliJ configurations
 * 	2 - Edit pom.xml and add spring-boot-devtools
 * 	3 - Add new REST endpoints to our app
 * 	4 - Verify the app automatically reloaded
 */
@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
