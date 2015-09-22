package BankApp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JDialog;


import framework.model.AcctType;
import framework.model.CustomerType;
import framework.model.IAddress;
import framework.model.Address;
import framework.view.AddAccountFrame;
import BankApp.view.AddPersonAccountFrame;
import BankApp.view.AddCompanyAccountFrame;
import BankApp.view.BankFrame;
import BankApp.BankApplication;

// Singleton for BankController
public class BankController {

	private static BankController instance = new BankController();
	private BankApplication	bankApplication;
	private BankFrame bankFrame;
	private AddAccountFrame addAccountFrame;
	private AcctType acctType;
	
	// must have private constructor in Singleton pattern used
	private BankController()
	{
		
	}
	
	public static BankController getInstance()
	{
		if(instance == null)
			instance = new BankController();
		
		return instance;
	}
	
	// set bank application
	public void setbank(BankApplication bank) {
			this.bankApplication = bank;
	}
	
	public void setbankfrm(BankFrame frm) {
		bankFrame = frm;
	}
	
	// ActionListener for PersonAccountListner 
	class PersonAccountListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JDialog personalDialog = new AddPersonAccountFrame(bankFrame);
			personalDialog.setVisible(true);
		}
	}
	public ActionListener getPersonAccountListener() {
		// TODO Auto-generated method stub
		
		return new PersonAccountListner();
	}
	
	class AddPersonAccount implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// // TODO Auto-generated method stub
			String[] fields = addAccountFrame.getAccountInfo();
			/* field value:
			 * 0: name
			 * 1: street
			 * 2: city
			 * 3: state
			 * 4: zip
			 * 5: birthdate
			 * 6: email
			 * 7: num of employees
			 * */
			IAddress addr = new Address(fields[1], fields[2], fields[3],fields[4]);

			bankApplication.addAccount(fields[0], addr, fields[5],
					acctType, CustomerType.PERSONAL, fields[6]);
			String[] rowdata = new String[8];
			rowdata[0] = fields[1];
			rowdata[1] = fields[2];
			rowdata[2] = fields[3];
			rowdata[3] = fields[4];
			rowdata[4] = "P";
			if(acctType == AcctType.CHECKING)
				rowdata[5] = "C";
			else if(acctType == AcctType.SAVINGS)
				rowdata[5] = "S";
			
			rowdata[6] = "0.0";
			rowdata[7] = fields[6];
			bankFrame.updateTable(rowdata);
			addAccountFrame.setVisible(false);
			
		}

	}
	public ActionListener getAddPersonAccountFrameOkListener(AddAccountFrame frame) {
		addAccountFrame = frame;
		return new AddPersonAccount();
	}
	
	
	class SavingBoxListener extends java.awt.event.MouseAdapter {
		@Override
		public void mouseClicked(java.awt.event.MouseEvent event) {
			acctType = AcctType.SAVINGS;
		}
	}

	class CheckingBoxListener extends java.awt.event.MouseAdapter {
		@Override
		public void mouseClicked(java.awt.event.MouseEvent event) {
			acctType = AcctType.CHECKING;
		}
	}

	public MouseListener getSavingBoxListener() {
		return new SavingBoxListener();

	}

	public MouseAdapter getCheckingBoxListener() {
		return new CheckingBoxListener();

	}

	
	// set setCompanyAccountListner
	class CompanyAccountListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog buisnessDialog = new AddCompanyAccountFrame(bankFrame);
			buisnessDialog.setVisible(true);

		}
	}
}
