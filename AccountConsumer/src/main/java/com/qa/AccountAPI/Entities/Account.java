package com.qa.AccountAPI.Entities;

public class Account {

	private Long id;
	private String firstname;
	private String lastname;
	private String accountNumber;

	public Account() {

	}

	public Account(Long id, String firstname, String lastname, String accountNumber) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return String.format("Account{id=%s, firstname=%s,lastname=%s,accountNumber=%s}", getId(), getFirstname(),
				getLastname(), getAccountNumber());
	}

}