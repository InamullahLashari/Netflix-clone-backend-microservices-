package com.example.server.netflix_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class NetflixDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixDiscoveryServerApplication.class, args);
	}

}
