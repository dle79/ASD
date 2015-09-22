package BankApp.view;

import javax.swing.*;

import BankApp.controller.BankController;
import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddPersonAccountFrame extends AddAccountFrame {
	
	private BankController control;

	JTextField birthDateTextField = new JTextField();
	
	
	public AddPersonAccountFrame(MainFrame parent) {
		super(parent);
		control = BankController.getInstance();
		
		super.birthDateLabel.setText("Birth date");
		getContentPane().add(birthDateLabel);
		birthDateLabel.setForeground(java.awt.Color.black);
		birthDateLabel.setBounds(12, 252, 96, 24);
		getContentPane().add(birthDateTextField);
		birthDateTextField.setBounds(84, 252, 156, 20);
		
		super.JButton_OK.addActionListener(control.getAddPersonAccountFrameOkListener(this));
		super.ChkRadioButton.addMouseListener(control.getCheckingBoxListener());
		super.SavRadioButton.addMouseListener(control.getSavingBoxListener());

	}



	public String[] getAccountInfo() {
		String[] fields = new String[8];
		fields[0] = nameTextField.getText();
		fields[1] = streetTextField.getText();
		fields[2] = cityTextField.getText();
		fields[3] = stateTextField.getText();
		fields[4] = zipTextField.getText();
		fields[5] = birthDateLabel.getText();
		fields[6] = emailTextField.getText();

		return fields;
	}

}
