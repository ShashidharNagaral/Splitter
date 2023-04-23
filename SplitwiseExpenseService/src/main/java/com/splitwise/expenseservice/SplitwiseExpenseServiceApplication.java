package com.splitwise.expenseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SplitwiseExpenseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseExpenseServiceApplication.class, args);
	}

}
