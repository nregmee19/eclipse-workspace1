package bank.controller;
import bank.model.Model;
import bank.view.*;

public abstract class AbstractController implements Controller {
	private View view;
	private Model model;
	
	public void setModel(Model model){this.model = model;}
	
	public Model getModel(){return model;}
	
	public View getView(){return view;}
	
	public void setView(View view){this.view = view;}

}
