package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringConfigSampleClientApplication {

	@Value("${vault.oracle.url}")
	private String oracleUrl;

	@Value("${vault.eventstore.url}")
	private String eventstoreUrl;

	@Value("${config.sample.message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigSampleClientApplication.class, args);
	}

	@Bean
	public CommandLineRunner initCommandLineRunner() {
		 return (args) -> {
			 System.out.println("Oracle URL: " + oracleUrl);
			 System.out.println("Eventstore URL: " + eventstoreUrl);
			 System.out.println("Sample Message: " + message);
		};
	}
}
