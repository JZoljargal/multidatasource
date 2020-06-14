package com.zoloo.multidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MultidatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultidatasourceApplication.class, args);
	}

}
