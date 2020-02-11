package com.nishant.service;

import com.nishant.model.Account;

public class AccountService {

	public void updateAccountBalance(Account account, double amount) {
		System.out.println("Account number is:" + account.getAccount_number() + "amount " + amount);
	}
}
