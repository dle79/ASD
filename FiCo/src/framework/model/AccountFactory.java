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

<<<<<<< HEAD

=======
>>>>>>> 69ec0837f038fe89e351711f1028a8534c5097b9
	@Override
	public ICustomer createCustomer(String name, CustomerType customerType,
			IAddress add, String email, String bdate) {
	    CustomerFactory cf = new CustomerFactory();
	    return cf.createCustomer(name, customerType, add, email, bdate);
		
	}
<<<<<<< HEAD


	
 
=======
>>>>>>> 69ec0837f038fe89e351711f1028a8534c5097b9

}