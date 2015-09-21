package framework.model;

import java.util.List;

public interface ICustomer extends IFinCoObserver {
	
	public String getName();
	public String getEmail();
	public void AddAccount(IAccount acct);
	public void removeAccount(IAccount acct);
	public List<IAccount>getAccountList();
	public String getCustomerType();
	public String[] getCustomerDetails();

}
