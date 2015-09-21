package framework.model;

public interface IAccountFactory {

	public IAccount createAccount(ICustomer customer, String acctNo, String acctType);

	public ICustomer createCustomer(String name, String customerType,
			IAddress add, String email, String anyVal);

}
