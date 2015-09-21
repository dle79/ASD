package framework.model;



/**
 * 
 */
public interface ICustomerFactory {

	public ICustomer createCustomer(String name, String customerType,
			IAddress add, String email, String anyVal);

}