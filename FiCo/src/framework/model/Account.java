package framework.model;

import java.util.*;

/**
 * 
 */
public class Account implements IAccount {

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * 
     */
    public Customer Subject;

	@Override
	public String getAcctNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> generateReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICustomer getAcctOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AcctType getAcctType() {
		// TODO Auto-generated method stub
		return null;
	}


}