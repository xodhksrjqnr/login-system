package com.taewan.login_api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApiServerApplication.class, args);
	}

}
