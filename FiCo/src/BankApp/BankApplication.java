package BankApp;

import java.util.ArrayList;
import java.util.List;

import framework.model.*;
import BankApp.controller.BankController;
import BankApp.controller.BankControllerFactory;
import BankApp.model.BankAccountFactory;
import BankApp.view.BankFrame;

public class BankApplication extends FinCo{
	
	ICustomer customer;
	IAccount acct;
    List<Transaction> listTran=new ArrayList<Transaction>();

	public static void main(String[] args) {
		BankApplication bank = new BankApplication();
		
		// single instance if controller
		BankController control = BankControllerFactory.getInstance().getBankController();
		control.setbank(bank);
		BankFrame frm = new BankFrame();
		control.setbankfrm(frm);
		frm.setVisible(true);
	}
	
	public void addAccount(String name, IAddress addr, String anyVal,
			AcctType acctType, CustomerType custType, String email) {
		
		IAccountFactory bankFactory = new BankAccountFactory();
	    ICustomerFactory factory=new CustomerFactory();
		customer = factory.createCustomer(name, custType, addr, email, anyVal);
		super.customerList.add(customer);
		
		acct = bankFactory.createAccount(customer, " ", acctType);
		super.accountList.add(acct);

	}
}
