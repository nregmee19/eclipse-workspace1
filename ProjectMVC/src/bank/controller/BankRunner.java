package bank.controller;



import java.util.List;

import bank.model.*;


public class BankRunner {
	private AccountInfo account;

	BankAccount allAcc=new BankAccount(); 
	List<AccountInfo> acc= allAcc.getAllAccount();
public static void main(String[] args) {
		
		//AccountOp myAcc = new AccountOp();

	
//		 System.out.println(acc1.getBalance());
//		myAcc.deposit(allAcc.getAcc(0), 100);
//		myAcc.withdrawal (allAcc.getAcc(0), 1100);
//		 AccountInfo acc1 = allAcc.getAcc(0);
//		System.out.println(acc1.getBalance());
		
		AccountViewController bankapps = new AccountViewController();
		bankapps.start();
		}

	

}