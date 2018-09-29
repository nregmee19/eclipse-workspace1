package bank.controller;

import java.util.List;

import bank.view.*;
import bank.model.*;
import bank.model.AccountInfo;
import bank.model.BankAccount;
import bank.view.AccountSelectView;
import bank.view.AccountView;

public class AccountViewController {
//	private AccountInfo account;
//	private double amount;
//	private AccountView accView;
	private AccountSelectView accSelView;
	//public AccountOp accoperation(account, amount);
	
	//public AccountInfo getAccount() {return account;}
	
		public void start() {
		accSelView = new AccountSelectView(this);
		//accView = new AccountView(this);
	}
	
		
}


