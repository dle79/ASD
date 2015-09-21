package BankApp;

import java.util.ArrayList;
import java.util.List;

import framework.model.*;
import BankApp.controller.BankController;
import BankApp.view.BankFrame;

public class BankApplication extends FinCo{
	
	ICustomer customer;
	IAccount acct;
    List<Transaction> listTran=new ArrayList<Transaction>();

	public static void main(String[] args) {
		BankApplication bank = new BankApplication();
		// single instance if controller
		BankController control = BankController.getInstance();
		control.setbank(bank);
		BankFrame frm = new BankFrame();
		control.setbankfrm(frm);
		frm.setVisible(true);
	}
	
	
}
