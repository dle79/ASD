package framework.model;
import java.util.*;

/**
 * 
 */
public class Organization extends Customer implements IOrganization {

	public Organization(String name, String email, IAddress address) {
		super(name, email, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNumOfEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


}