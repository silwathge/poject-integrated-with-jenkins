package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsMavenApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		System.out.println("Hi there edited, jenkins should pick this up now");
		SpringApplication.run(JenkinsMavenApplication.class, args);
	}

}
