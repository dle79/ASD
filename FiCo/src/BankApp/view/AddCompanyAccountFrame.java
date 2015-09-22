package BankApp.view;

import BankApp.controller.BankController;
import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddCompanyAccountFrame extends AddAccountFrame {
	
	BankController control;

	public AddCompanyAccountFrame(MainFrame parent) {
		super(parent);
		control = BankController.getInstance();
	}
}
