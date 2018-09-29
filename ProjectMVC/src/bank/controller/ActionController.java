package bank.controller;

import bank.model.*;
import bank.view.*;

public class ActionController {
	private AccountInfo acc;
	private double amount;
	private AccountOp operation;
	private AgentDeposit autoDeposit;
	private AgentWithdraw autoWithdraw;
	
	public ActionController(AccountInfo acc, double amount){
		this.acc = acc;
		this.amount = amount;
		}
	public void Deposit() {
		operation = new AccountOp(acc, amount);
		operation.deposit();
//		BankController newAccView = new BankController(acc);
//		
//		newAccView.start();
	}
	public void autoDeposit() {
		autoDeposit = new AgentDeposit(acc, amount);
		autoDeposit.run();
		BankController newAccView = new BankController(acc);
		
		newAccView.start();
	}
	public void withdraw() {
		operation = new AccountOp(acc,amount);
		operation.withdrawal(acc, amount);
		//BankController newAccView = new BankController(acc);
		//newAccView.start();
		// TODO Auto-generated method stub
		
	}
	public AccountInfo getAccount() {
		return acc;
		// TODO Auto-generated method stub
		//return null;
	}
	
}
