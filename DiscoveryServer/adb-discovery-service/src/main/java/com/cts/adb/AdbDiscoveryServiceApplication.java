package com.cts.adb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdbDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdbDiscoveryServiceApplication.class, args);
	}

}
