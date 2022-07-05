package com.infosys.infygoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class InfygoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfygoConfigServerApplication.class, args);
	}

}
