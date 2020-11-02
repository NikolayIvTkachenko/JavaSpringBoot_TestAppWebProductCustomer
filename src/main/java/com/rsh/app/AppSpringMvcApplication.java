package com.rsh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.rsh"})
@EntityScan("com.rsh")
public class AppSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringMvcApplication.class, args);
	}

}
