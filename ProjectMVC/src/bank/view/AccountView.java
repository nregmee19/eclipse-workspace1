package bank.view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


import bank.controller.BankController;
import bank.model.AccountInfo;
import bank.model.BankAccount;

public class AccountView extends JFrame {
	private AccountPanel basepanel;
	
	
	
	
	
	public AccountView(BankController baseController) {
		basepanel = new AccountPanel(baseController);
		setupFrame();
	}
	private void setupFrame() {
		this.setContentPane(basepanel);
		this.setSize(700,700);
		this.setVisible(true);
		
		}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
		
	}

	
