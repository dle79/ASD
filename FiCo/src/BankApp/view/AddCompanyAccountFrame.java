package BankApp.view;

import javax.swing.*;

import BankApp.controller.BankController;
import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddCompanyAccountFrame extends AddAccountFrame {
	
	BankController control;

	JTextField noOfEmployeeTextField = new JTextField();
	JLabel noOfEmployeeLabel = new JLabel();
	protected JRadioButton ChkRadioButton = new JRadioButton();
	protected JRadioButton SavRadioButton = new JRadioButton();
	
	public AddCompanyAccountFrame(MainFrame parent) {
		super(parent);
		control = BankController.getInstance();
		
		setTitle("Add Company Account");
		ChkRadioButton.setText("Checking");
		ChkRadioButton.setActionCommand("Checkings");
		getContentPane().add(ChkRadioButton);
		ChkRadioButton.setBounds(12, 12, 100, 24);
		
		SavRadioButton.setText("Saving");
		SavRadioButton.setActionCommand("Savings");
		getContentPane().add(SavRadioButton);
		SavRadioButton.setBounds(12, 36, 100, 24);
		
		noOfEmployeeLabel.setText("No of employees");
		getContentPane().add(noOfEmployeeLabel);
		noOfEmployeeLabel.setForeground(java.awt.Color.black);
		noOfEmployeeLabel.setBounds(12,228,100,24);
		getContentPane().add(noOfEmployeeTextField);
		noOfEmployeeTextField.setBounds(100,228,156,20);
		
		super.JButton_OK.addActionListener(control.getAddCompanynAccountFrameOkListener(this));
		ChkRadioButton.addMouseListener(control.getCheckingBoxListener());
		SavRadioButton.addMouseListener(control.getSavingBoxListener());
		
	}
}
