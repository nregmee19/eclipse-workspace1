package bank.model;

import javax.swing.JOptionPane;

public class AccountOp {
	private double balance;
	private double amount;
	private AccountInfo account;
	private String msg = "you dont have enough balance";
	
	public AccountOp(AccountInfo acc, double amount) {
		this.account = acc;
		this.amount = amount;
	}
	public synchronized void deposit(){
		balance =account.getBalance();
		balance += amount;
		account.setBalance(balance);
//		final ModelEvent me = new ModelEvent(account, balance, msg,amount) {
//			//notifyChange(me)
//		}
			
		
		notifyAll();
		
		
	}
	public class NegativeBalanceException extends Exception{
		
	}

	
public synchronized void withdrawal (AccountInfo account, double amount ) {
	try {
		balance =account.getBalance();
		if (balance-amount < 0) throw new NegativeBalanceException();
		balance -= amount;
		account.setBalance(balance);
	}catch( NegativeBalanceException e) {
		System.out.println(msg);
	
		}
	}
}
