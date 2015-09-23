package CCardApp;

import framework.model.*;
import CCardApp.controller.*;
import CCardApp.view.*;
import CCardApp.model.*;



public class CCreditApplication extends FinCo {
	
	private  ICustomer cust;
	private IAccount acct;
	public static void main(String args[])
	{
		CCreditApplication creditCardProcessingSystem = new CCreditApplication();
        CreditCardController control = CreditCardController.getInstance();
        control.setCreditcardProcessor(creditCardProcessingSystem);
        CreditcardFrame mainFrame = new CreditcardFrame(
                "Creditcard processing Application");
        control.setCreditcardForm(mainFrame);

        mainFrame.setVisible(true);		
	}
	
	public void addAccount(String name, IAddress address, String value,
          String acctNo, AcctType acctType, CustomerType custType, String expDate, String email) {

        CreditCardFactory factory = new CreditCardFactory();
        cust = factory.createCustomer(name, custType, address, email, value);
        super.customerList.add(cust);

        acct = factory.createAccount(cust, acctNo, acctType, expDate);

        super.accountList.add(acct);

    }

}
