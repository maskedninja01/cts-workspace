package com.cts.adb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Stage01AdbCofigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage01AdbCofigServiceApplication.class, args);
	}

}
