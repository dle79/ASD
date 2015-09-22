package framework.model;

import java.util.*;

/**
 * 
 */
public class AccountFactory implements IAccountFactory {


	@Override
	public IAccount createAccount(ICustomer customer, String acctNo,
			AcctType acctType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICustomer createCustomer(String name, CustomerType customerType,
			IAddress add, String email, String bdate) {
	    CustomerFactory cf = new CustomerFactory();
	    return cf.createCustomer(name, customerType, add, email, bdate);
	}

}