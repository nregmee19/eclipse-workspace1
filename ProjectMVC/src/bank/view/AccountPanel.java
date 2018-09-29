package bank.view;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


import javax.swing.*;

import bank.controller.ActionController;
import bank.controller.BankController;
import bank.model.AccountInfo;
import java.awt.Color;


public class AccountPanel extends JPanel {
	
	private AccountInfo acc;
	private double amt;
	
	
	private BankController baseController;
	private JLabel balancelabel;
	private JLabel amountlabel;
	private JLabel balanceTextField;
	private JTextField amountTextField;
	private JLabel name;
	private JLabel accountName;
	private JLabel number;
	private JLabel accNum;
	
	private JButton depositButton;
	private JButton autodepositButton;
	private JButton withdrawalButton;
	private JButton autowithdrawalButton;
	private SpringLayout baselayout;
	private JComboBox currency;
	

	public synchronized double getAmt() {
		return amt;
	}

	public AccountPanel (BankController baseController) {
		String currencyName[] = {"Doller","Yen","Euro"};
		
		this.baseController = baseController;
		acc = baseController.getAccount();
		String balance = acc.getBalanceinString();
		String accNo = Integer.toString(acc.getAccNum());
		
		balancelabel = new JLabel("Balance");
		amountlabel = new JLabel ("Amount");
		amountlabel.setBackground(Color.CYAN);
		balanceTextField = new JLabel (balance);
		amountTextField= new JTextField ("0.00");
		amountTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		accNum = new JLabel(accNo);
		number = new JLabel(" Account Number");
		name = new JLabel("Name");
		accountName = new JLabel(acc.getname());
		depositButton = new JButton ("Deposit");
		autodepositButton = new JButton ("AutoDeposit");
		withdrawalButton = new JButton("WithDraw") ;
		autowithdrawalButton = new JButton("Agent Withdraw") ;
		baselayout = new SpringLayout();
		
		
	    currency = new JComboBox(currencyName);
	   
		
		setupPanel();
		setupLayout();
		setupListener();
	
		
	}
	
private void setupLayout() {
	baselayout.putConstraint(SpringLayout.NORTH, accNum, -6, SpringLayout.NORTH, number);
	baselayout.putConstraint(SpringLayout.WEST, accNum, 85, SpringLayout.EAST, number);
	baselayout.putConstraint(SpringLayout.SOUTH, accNum, 16, SpringLayout.NORTH, number);
	baselayout.putConstraint(SpringLayout.EAST, accNum, 197, SpringLayout.EAST, number);
	baselayout.putConstraint(SpringLayout.NORTH, name, 0, SpringLayout.NORTH, accountName);
	baselayout.putConstraint(SpringLayout.EAST, name, 0, SpringLayout.EAST, amountlabel);
	baselayout.putConstraint(SpringLayout.NORTH, amountTextField, -3, SpringLayout.NORTH, amountlabel);
	baselayout.putConstraint(SpringLayout.WEST, amountTextField, 0, SpringLayout.WEST, balanceTextField);
	baselayout.putConstraint(SpringLayout.EAST, amountTextField, 27, SpringLayout.EAST, balanceTextField);
	baselayout.putConstraint(SpringLayout.NORTH, number, 127, SpringLayout.NORTH, this);
	baselayout.putConstraint(SpringLayout.EAST, number, -453, SpringLayout.EAST, this);
	baselayout.putConstraint(SpringLayout.SOUTH, accountName, -61, SpringLayout.NORTH, balanceTextField);
	baselayout.putConstraint(SpringLayout.EAST, balanceTextField, -319, SpringLayout.EAST, this);
	baselayout.putConstraint(SpringLayout.NORTH, amountlabel, 39, SpringLayout.SOUTH, balancelabel);
	baselayout.putConstraint(SpringLayout.WEST, amountlabel, 0, SpringLayout.WEST, balancelabel);
	baselayout.putConstraint(SpringLayout.WEST, balancelabel, 175, SpringLayout.WEST, this);
	baselayout.putConstraint(SpringLayout.NORTH, balanceTextField, 0, SpringLayout.NORTH, balancelabel);
	baselayout.putConstraint(SpringLayout.NORTH, balancelabel, 17, SpringLayout.SOUTH, number);
	baselayout.putConstraint(SpringLayout.EAST, accountName, -312, SpringLayout.EAST, this);
	baselayout.putConstraint(SpringLayout.NORTH, depositButton, 0, SpringLayout.NORTH, withdrawalButton);
	baselayout.putConstraint(SpringLayout.EAST, depositButton, -171, SpringLayout.EAST, this);
	baselayout.putConstraint(SpringLayout.WEST, withdrawalButton, 86, SpringLayout.WEST, this);
	baselayout.putConstraint(SpringLayout.SOUTH, withdrawalButton, -123, SpringLayout.NORTH, autodepositButton);
	
	baselayout.putConstraint(SpringLayout.NORTH, autodepositButton, 0, SpringLayout.NORTH, autowithdrawalButton);
	baselayout.putConstraint(SpringLayout.WEST, autodepositButton, 25, SpringLayout.WEST, this);
	baselayout.putConstraint(SpringLayout.SOUTH, autowithdrawalButton, -77, SpringLayout.SOUTH, this);
	baselayout.putConstraint(SpringLayout.EAST, autowithdrawalButton, -32, SpringLayout.EAST, this);
	 baselayout.putConstraint(SpringLayout.NORTH, currency, -3, SpringLayout.NORTH, balanceTextField);
	    baselayout.putConstraint(SpringLayout.WEST, currency, 494, SpringLayout.WEST, this);
	    baselayout.putConstraint(SpringLayout.EAST, currency, -81, SpringLayout.EAST, this);

}
private void setupPanel() {
	this.setSize(700,700);
	this.setLayout(baselayout);
	this.add(amountTextField);
	this.add(amountlabel);
	this.add(autodepositButton);
	this.add(autowithdrawalButton);
	this.add(balanceTextField);
	this.add(balancelabel);
	this.add(depositButton);
	this.add(withdrawalButton);
	this.add(name);
	this.add(accountName);
	this.add(number);
	this.add(accNum);
	this.add(currency);
	
	
}
private void setupListener() {
	
	depositButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent click) {
			
			String amtfield = amountTextField.getText();
			double amount = 0.00;
			amount = Double.parseDouble(amtfield);
			amt = amount;
			
			amt = Double.parseDouble(amtfield);
			ActionController newAction = new ActionController(acc, amt);
			newAction.Deposit();
			acc = newAction.getAccount();
			balanceTextField.setText(acc.getBalanceinString());
			
		}
	});
	autodepositButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent click) {
			amt = Double.parseDouble(amountTextField.getText());
			String amtfield = amountTextField.getText();
			double amount = 0.00;
			amount = Double.parseDouble(amtfield);
			amt = amount;
			
			amt = Double.parseDouble(amtfield);
			ActionController newAction = new ActionController(acc, amt);
			newAction.autoDeposit();
			
			
			
		}
	});
	withdrawalButton.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent click) {
		    amt = Double.parseDouble(amountTextField.getText());
			if (acc.getBalance() < amt) {
				JOptionPane.showMessageDialog(null,"You do not have sufficient Balance to make this transection");
			}
			else {
				ActionController newAction = new ActionController(acc, amt);
				newAction.withdraw();
				acc = newAction.getAccount();
				balanceTextField.setText(acc.getBalanceinString());
				
				//baseController.accView.close();
			}
		}
		});
	autowithdrawalButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent click) {
		//	double balance = 
		}
	});
	currency.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent select) {
				int combofield = currency.getSelectedIndex();
				if (combofield == 0) {
					double balance = acc.getBalance();
					balanceTextField.setText(acc.getBalanceinString());
					
				}
				else if (combofield == 1) {
					double balance = acc.getBalance()*94.1;
					balanceTextField.setText(""+balance);
					
					
				}
				else{
					double balance = acc.getBalance()*0.79;
					balanceTextField.setText(""+balance);
				}
			}
				
			});

}
}
