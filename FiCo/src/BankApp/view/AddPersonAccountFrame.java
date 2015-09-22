package BankApp.view;

import javax.swing.*;

import BankApp.controller.BankController;
import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddPersonAccountFrame extends AddAccountFrame {
	
	private BankController control;

//	JRadioButton ChkRadioButton = new JRadioButton();
//	JRadioButton SavRadioButton = new JRadioButton();
	JTextField birthDateTestField = new JTextField();
	
	
	public AddPersonAccountFrame(MainFrame parent) {
		super(parent);
		control = BankController.getInstance();

//		ChkRadioButton.setText("Checking");
//		ChkRadioButton.setActionCommand("Checkings");
//		getContentPane().add(ChkRadioButton);
//		ChkRadioButton.setBounds(36, 12, 84, 24);
//		
//		SavRadioButton.setText("Saving");
//		SavRadioButton.setActionCommand("Savings");
//		getContentPane().add(SavRadioButton);
//		SavRadioButton.setBounds(36, 36, 84, 24);
		
		super.birthDateLabel.setText("Birth date");
		getContentPane().add(birthDateLabel);
		birthDateLabel.setForeground(java.awt.Color.black);
		birthDateLabel.setBounds(12, 252, 96, 24);
		getContentPane().add(birthDateTestField);
		birthDateTestField.setBounds(84, 252, 156, 20);

		JButton_OK.addActionListener(control.getAddPersonAccountFrameOkListener(this));
		ChkRadioButton.addMouseListener(control.getCheckingBoxListener());
		SavRadioButton.addMouseListener(control.getSavingBoxListener());

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
