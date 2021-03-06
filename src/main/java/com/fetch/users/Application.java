package com.fetch.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firebase.client.Firebase;

@Configuration
@SpringBootApplication
@ComponentScan(value="com.fetch.users")
@EnableAutoConfiguration
public class Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);

	}
}
