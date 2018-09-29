package bank.model;

import java.util.ArrayList;
import java.util.List;
import bank.model.*;

public class BankAccount {
	
	private List<AccountInfo> allAccount;
	
	public BankAccount() {
		allAccount=new ArrayList<AccountInfo>();
	}
	
	public List<AccountInfo> getAllAccount(){
		
		allAccount.add(new AccountInfo("Niraj2",214201,1000.00));
		allAccount.add(new AccountInfo("bill3",214202,1000.00));
		allAccount.add(new AccountInfo("sam",214203,1000.00));
		allAccount.add(new AccountInfo("chang",214204,1000.00));
		allAccount.add(new AccountInfo("julie",214205,1000.00));
		allAccount.add(new AccountInfo("aniza",214206,1000.00));
		allAccount.add(new AccountInfo(" ",0 ,0.00));
		
		return allAccount;
	}
	public AccountInfo getAcc(int i) {
		AccountInfo acc = allAccount.get(i);
		return acc;
	}
	
	public int findAcc (String name) {
		int myacc = -1;
		for (int i = 0; i < allAccount.size(); i++)
		{
			
		
			if (allAccount.get(i).getname() == name) {
			myacc = i;	
			}
			
		}
		
		return myacc;
	}
	/*
	
	Niraj (214201),
	bill (214202),
	sam (214203),
	chang (214204),
	julie (214204),
	kathie (214205),
	aniza (214206);
	
	private final int accNumber;
	
	
	BankAccount(int accountNumber){
		accNumber = accountNumber;
		
	}
	
	public int getAccNum() {
		return accNumber;
	}
	*/
}
