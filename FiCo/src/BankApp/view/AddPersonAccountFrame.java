package BankApp.view;

import BankApp.controller.BankController;
import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddPersonAccountFrame extends AddAccountFrame {
	
	BankController control;

	public AddPersonAccountFrame(MainFrame parent) {
		super(parent);
		control = BankController.getInstance();

		// make some button, label, here

	}

}
