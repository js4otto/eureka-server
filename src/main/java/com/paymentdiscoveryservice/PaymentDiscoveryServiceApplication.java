package com.paymentdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PaymentDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentDiscoveryServiceApplication.class, args);
	}

}
