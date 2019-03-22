package com.qa.AccountAPI.Entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AccountConsumerApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(AccountConsumerApplication.class, args);
		ac.getBean(AccountRepo.class).save(new Account(1l, "f", "h", "n"));
	}

}
