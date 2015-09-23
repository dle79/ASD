package BankApp.view;

import BankApp.controller.BankController;
import BankApp.controller.BankControllerFactory;
import BankApp.controller.WithdrawController;
import framework.model.Account;
import framework.view.MainFrame;
import framework.view.TransactionFrame;

public class WithdrawFrame extends TransactionFrame{
	private String withdrawDate;
	private double amount;
	private Account account;
	private WithdrawController control = BankControllerFactory.getInstance().getWithDrawController(this);
	
	public WithdrawFrame(MainFrame parent, String title, String aaccnr) {
		super(parent, title, aaccnr);
		
		this.JButton_OK.addActionListener(control.getButtonOKActionListener());
		// TODO Auto-generated constructor stub
	}

	public String getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(String withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}