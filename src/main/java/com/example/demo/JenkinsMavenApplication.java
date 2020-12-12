package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsMavenApplication {

	public static void main(String[] args) {
		System.out.println("Hi there edited, jenkins should pick this up now");
		SpringApplication.run(JenkinsMavenApplication.class, args);
	}

}
