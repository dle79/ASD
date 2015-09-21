package framework.model;

import java.util.*;

/**
 * 
 */
public class AccountFactory implements IAccountFactory {


	@Override
	public IAccount createAccount(ICustomer customer, String acctNo,
			String acctType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICustomer createCustomer(String name, String customerType,
			IAddress add, String email, String anyVal) {
	    CustomerFactory cf = new CustomerFactory();
	    return cf.createCustomer(name, customerType, add, email, anyVal);
		
	}

 

}