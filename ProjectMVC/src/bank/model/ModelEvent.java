package bank.model;
import java.awt.event.ActionEvent;

public class ModelEvent extends ActionEvent {
	private AccountInfo account;
	private double amount;
	public ModelEvent(AccountInfo account,int id, String message, double amount){
		super(account, id, message);
		this.amount = amount;
		this.account= account;
	}
	public double getAmount(){return amount;}
}
