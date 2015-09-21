package framework.model;
import java.util.*;

/**
 * 
 */
public class Person extends Customer implements IPerson {

	public Person(String name, String email, IAddress address) {
		super(name, email, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getBirthDate() {
		// TODO Auto-generated method stub
		return null;
	}


}