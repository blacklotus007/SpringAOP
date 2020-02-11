package com.nishant.model;

public class Account {
	private String account_number;
	private String account_description;

	public Account(String account_number, String account_description) {
		super();
		this.account_number = account_number;
		this.account_description = account_description;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_description() {
		return account_description;
	}

	public void setAccount_description(String account_description) {
		this.account_description = account_description;
	}

}
