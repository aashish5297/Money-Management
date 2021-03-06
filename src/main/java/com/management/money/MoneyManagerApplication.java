package com.management.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MoneyManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyManagerApplication.class, args);
	}

}
