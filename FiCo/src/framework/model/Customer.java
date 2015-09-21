package framework.model;

import java.util.*;




public class Customer implements ICustomer {

	private String custName;
	private String custEmailAddress;
	private IAddress custAddress;
	private List<IAccount> accountList;
	private List<String> emailList;

	public Customer(String name, String email, IAddress address) {
		

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void AddAccount(IAccount acct) {
		accountList.add(acct);

	}

	@Override
	public void removeAccount(IAccount acct) {
		
	}

	@Override
	public List<IAccount> getAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCustomerType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String emailMessage) {
		// TODO Auto-generated method stub
		
	}

	public List<String> getEmailList() {
		return null;
	}

	public void setEmailList(List<String> emailList) {
	}

	@Override
	public String[] getCustomerDetails() {

		return null;

	}

}