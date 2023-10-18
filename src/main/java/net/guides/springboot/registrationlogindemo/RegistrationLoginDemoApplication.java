package net.guides.springboot.registrationlogindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.guides.springboot.registrationlogindemo.config.SpringSecurity")
@ComponentScan("net.guides.springboot.registrationlogindemorepository.UserRepository")
public class RegistrationLoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginDemoApplication.class, args);
	}

}
