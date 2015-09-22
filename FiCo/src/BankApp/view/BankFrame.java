package BankApp.view;

import javax.swing.*;

import BankApp.controller.BankController;
import framework.view.MainFrame;


public class BankFrame extends MainFrame {

	private JButton personAccountButton = new JButton("Add personal account");
	private JButton companyAccountButton = new JButton("Add company account");
	private BankController control;

	public BankFrame() {
		super();
		this.control = BankController.getInstance();
		super.setTitle("Bank Application.");
		
		super.withdrawButton.setText("Withdraw");
		
		personAccountButton.setBounds(24, 20, 192, 33);
		companyAccountButton.setBounds(240, 20, 192, 33);
		
		super.frameJPanel.add(personAccountButton);
		super.frameJPanel.add(companyAccountButton);
		
		
		super.model.addColumn("Street");
		super.model.addColumn("City");
		super.model.addColumn("State");
		super.model.addColumn("Zip");
		super.model.addColumn("P/C");
		super.model.addColumn("Ch/S");
		super.model.addColumn("Amount");
		
		
		personAccountButton.addActionListener(control.getPersonAccountListener());
		
	}

	public void updateTable(String[] data) {
		

	}


}
