package bank.model;

import bank.model.AccountOp.NegativeBalanceException;

public class AgentWithdraw implements Runnable{
	
	private AccountInfo account;
	
	public double amount;
	private AccountOp bankacc = new AccountOp(account, amount);
	
	
		
	
public AgentWithdraw(AccountInfo account, double amount) {
	this.account = account;
	this.amount = amount;
}	
	public void run() {
		try {
			
			while(true) {
				if (account.getBalance() < amount)
					wait();
				bankacc.withdrawal(account, amount);
			}
		}catch(Exception insufficientfund){
		
	}
	}

	
	
	public synchronized AccountInfo getAccount() {
		return account;
	}

	public synchronized void setAccount(AccountInfo account) {
		this.account = account;
	}

	public synchronized AccountOp getBankacc() {
		return bankacc;
	}

	public synchronized void setBankacc(AccountOp bankacc) {
		this.bankacc = bankacc;
	}

	public synchronized double getAmount() {
		return amount;
	}

	public synchronized void setAmount(double amount) {
		this.amount = amount;
	}

	}

