package fr.emiage.agence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "fr.emiage.agence.dao")
@SpringBootApplication
public class AgenceApplication {

	private static final Logger log = LoggerFactory.getLogger(AgenceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AgenceApplication.class, args);
	}
}
