package io.github.adrianmorais.clientsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsServiceApplication.class, args);
	}

}
