package com.qa.AccountAPI.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	@Autowired 
	private AccountRepo repo;
	@JmsListener(destination = "Account", containerFactory = "myFactory")
	public void receiveMessage(Account account) {
		System.out.println("Received <" + account + ">"); 
		repo.save(account);
		
	}
}
