package bank.controller;

import bank.view.*;

import java.util.List;

import bank.model.*;

public class BankController {
	private AccountInfo account;
	private double amount;
	public AccountView accView;
	//private AccountSelectView accSelView;
	private BankAccount allAccount = new BankAccount();
	
	//public Object accoperation;
	//public AccountOp accoperation(account, amount);
	
	public BankController(String name) {
		//List<AccountInfo> acc= allAcc.getAllAccount();
		allAccount.getAllAccount();
		int i = -1;
		
		i =allAccount.findAcc(name);
		
		account = allAccount.getAcc(i);
		
	}
	public BankController(AccountInfo account) {
		
		this.account = account;
		
		
		
	}
	public AccountInfo getAccount() {return account;}
	public void start() {
		//accSelView = new AccountSelectView(this);
		accView = new AccountView(this);
	}
	

}
