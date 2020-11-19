package com.axis.idm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.axis.idm.*")
public class IdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdmApplication.class, args);
	}

}
