package br.com.phdigitalcode.namingserverMS1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingServerMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerMs1Application.class, args);
	}

}
