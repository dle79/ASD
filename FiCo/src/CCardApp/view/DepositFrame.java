package CCardApp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CCardApp.controller.CreditCardController;
import framework.view.MainFrame;

import javax.swing.*;

public class DepositFrame extends JDialog {
	
	CreditCardController control;
	
	JLabel JLabel1 = new JLabel();
	JLabel JLabel2 = new JLabel();
	JTextField JTextField_NAME = new JTextField();
	public JButton JButton_OK = new JButton();
	JButton JButton_Cancel = new JButton();
	public JTextField JTextField_Deposit = new JTextField();
	
	private MainFrame parentframe;
	private String accnr;
	
	public DepositFrame(MainFrame parent, String aaccnr) {
		
		control = CreditCardController.getInstance();
		
		parentframe=parent;
		accnr=aaccnr;

		setLocationRelativeTo(null); // at middle of screen 
		
		setTitle("Deposit");

		getContentPane().setLayout(null);
		setSize(300,200);
		setVisible(false);
		JLabel1.setText("Acc Nr");
		getContentPane().add(JLabel1);
		JLabel1.setForeground(java.awt.Color.black);
		JLabel1.setBounds(12,12,48,24);

		JLabel2.setText("Amount");
		getContentPane().add(JLabel2);
		JLabel2.setForeground(java.awt.Color.black);
		JLabel2.setBounds(12,48,48,24);
		
		JTextField_NAME.setEditable(false);
		getContentPane().add(JTextField_NAME);
		JTextField_NAME.setBounds(84,12,144,24);
		JTextField_NAME.setText(accnr);
		
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(36,84,84,24);
		
		JButton_Cancel.setText("Cancel");
		JButton_Cancel.setActionCommand("Cancel");
		getContentPane().add(JButton_Cancel);
		JButton_Cancel.setBounds(156,84,84,24);
		
		getContentPane().add(JTextField_Deposit);
		JTextField_Deposit.setBounds(84,48,144,24);
		
	    
	    
		JButton_OK.addActionListener(control.getDepositOKListener(this));
		JButton_Cancel.addActionListener(new CloseListener() );
	}

	public String getAmount() {
		
		return JTextField_Deposit.getText();
	}
	
	private class CloseListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
}
