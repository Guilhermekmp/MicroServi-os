package com.example.microservicos.forma_envio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FormaEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormaEnvioApplication.class, args);
	}

}
