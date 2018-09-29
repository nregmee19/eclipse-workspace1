package bank.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


import bank.controller.*;
import bank.model.AccountInfo;
import bank.model.BankAccount;

public class AccountSelectPanel extends JPanel {

	private BankController account;
	private AccountViewController baseController;
	private JComboBox accountsCombobox;
	private JButton submitButton;
	private SpringLayout baselayout;
	
	public AccountSelectPanel (AccountViewController baseController) {
		
		BankAccount allAcc=new BankAccount(); 
		List<AccountInfo> Allacc= allAcc.getAllAccount();
		
		List<String> NameList=new ArrayList<String>();
		for(AccountInfo acc:Allacc) {
			NameList.add(acc.getname());
		
		}
		
		this.baseController = baseController;
		accountsCombobox = new JComboBox(NameList.toArray());
		submitButton = new JButton("Submit");
		baselayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupListener();
	
		
	}
	
private void setupLayout() {
	baselayout.putConstraint(SpringLayout.NORTH, accountsCombobox, 73, SpringLayout.NORTH, this);
	baselayout.putConstraint(SpringLayout.WEST, accountsCombobox, 128, SpringLayout.WEST, this);
	baselayout.putConstraint(SpringLayout.EAST, accountsCombobox, 242, SpringLayout.WEST, this);

	baselayout.putConstraint(SpringLayout.NORTH, submitButton, -1, SpringLayout.NORTH, accountsCombobox);
	baselayout.putConstraint(SpringLayout.WEST, submitButton, 21, SpringLayout.EAST, accountsCombobox);
	
}
private void setupPanel() {
	this.setLayout(baselayout);
	this.add(accountsCombobox);
	this.add(submitButton);
	
}
private void setupListener() {
	
	 submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click) {
				String combofield = (String) accountsCombobox.getSelectedItem();
				account = new BankController(combofield);
				account.start();
				//AccountInfo account = allAcc.find(combofield);
				//System.out.println("you have selected :"+combofield);
			}
				
			});

	 
}

}
