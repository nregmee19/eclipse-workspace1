package bank.view;

import javax.swing.*;

import bank.controller.AccountViewController;
import bank.controller.BankController;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class AccountSelectView extends JFrame {
private AccountSelectPanel basepanel;
	
	
	
	
	
	public AccountSelectView(AccountViewController baseController) {
		setTitle("Select an account");
		this.basepanel = new AccountSelectPanel(baseController);
		basepanel.setBackground(Color.CYAN);
		setupFrame();
	}
	private void setupFrame() {
		this.setContentPane(basepanel);
		this.setSize(500,500);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{basepanel}));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		
		}
		
	}