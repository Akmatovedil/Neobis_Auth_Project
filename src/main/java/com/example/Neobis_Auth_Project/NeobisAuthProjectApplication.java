package com.example.Neobis_Auth_Project;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j
@EnableSwagger2
@OpenAPIDefinition(servers = {
		@Server(url = "/", description = "Default Server URL")})
public class NeobisAuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeobisAuthProjectApplication.class, args);
	}

}
