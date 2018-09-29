package bank.model;
import java.util.*;


public class AccountInfo {
	private String accName;
	private int accNum;
	private double balance;
	
	public AccountInfo(String name, int num, double bal ) {
		this.accName=name;
		this.accNum=num;
		this.balance=bal;
	}
	
	
	/*void AccountInfo(String name, int num, double bal ) {
		accName = name;
		accNum = num;
		balance = bal;
	}*/
	public String getname() {return accName;}
	public int getAccNum() {return accNum;}
	public double getBalance() {return balance;}
	public String getBalanceinString() {return ""+(balance);};
	public void setBalance(double balance) {this.balance = balance;}
}
