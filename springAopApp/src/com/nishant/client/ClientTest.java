package com.nishant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.model.Account;
import com.nishant.service.AccountService;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

		AccountService accountservice = ctx.getBean(AccountService.class);

		accountservice.updateAccountBalance(new Account("6779989", "Money Transfer"), 30000);
	}

}
