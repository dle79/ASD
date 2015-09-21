package BankApp.view;

import BankApp.controller.BankController;
import framework.view.MainFrame;


public class BankFrame extends MainFrame {

	javax.swing.JButton JButton_Pac = new javax.swing.JButton();
	javax.swing.JButton JButton_Cac = new javax.swing.JButton();
	private BankController control;

	public BankFrame() {
		super();
		control = BankController.getInstance();
		setTitle("Bank Application.");

	}

	public void updateTable(String[] data) {
		

	}


}
