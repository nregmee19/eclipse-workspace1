package bank.model;

public class AgentDeposit implements Runnable {
	private AccountInfo account;
	
	public double amount;
	private AccountOp bankacc = new AccountOp(account, amount);
	
	
		
	
public AgentDeposit(AccountInfo account, double amount) {
	this.account = account;
	this.amount = amount;
}




@Override
public void run() {
	while(true) {
		bankacc.deposit();
		notifyAll();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// TODO Auto-generated method stub
	
}	
	
		


}
