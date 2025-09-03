package com.gustav.ws_lektion6_postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.gustav.ws")
@EnableJpaRepositories("com.gustav.ws.repo")
@EntityScan("com.gustav.ws.model")
public class WsLektion6PostgresApplication {
	public static void main(String[] args) {
		SpringApplication.run(WsLektion6PostgresApplication.class, args);
	}
}
