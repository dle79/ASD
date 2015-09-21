package BankApp.controller;

import BankApp.view.BankFrame;
import BankApp.BankApplication;

// Singleton for BankController
public class BankController {

	private static BankController instance = new BankController();
	private BankApplication	bankApplication;
	private BankFrame bankFrame;
	// must have private constructor
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
}
