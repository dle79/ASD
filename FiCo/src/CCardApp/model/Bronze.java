package CCardApp.model;

import framework.model.*;



public class Bronze extends CreditCardAccount {

	private double interestRate = 0.1;

	public Bronze(ICustomer cust, String accnr, String expDate) {
		super(cust, accnr, expDate);
	}

	@Override
	public double getCurrentMonthlyBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMonthlyDues() {
		// TODO Auto-generated method stub
		return 0;
	}
}
