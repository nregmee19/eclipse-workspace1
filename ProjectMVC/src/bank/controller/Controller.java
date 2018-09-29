package bank.controller;
import javax.swing.text.View;

import bank.model.Model;
import bank.view.AccountView;


public interface Controller {
	void setModel(Model model);
	Model getModel();
	AccountView getView();
	void setView(View view);
}
