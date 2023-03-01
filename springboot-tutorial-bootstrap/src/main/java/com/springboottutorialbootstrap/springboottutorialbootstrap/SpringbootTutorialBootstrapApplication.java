package com.springboottutorialbootstrap.springboottutorialbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.springboottutorialbootstrap.springboottutorialbootstrap.repository")
@EntityScan("com.springboottutorialbootstrap.springboottutorialbootstrap.model")
@SpringBootApplication
public class SpringbootTutorialBootstrapApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialBootstrapApplication.class, args);
	}

}
