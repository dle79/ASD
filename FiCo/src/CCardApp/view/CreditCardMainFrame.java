package CCardApp.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.UIManager;

import CCardApp.controller.CreditCardController;
import framework.view.MainFrame;

public class CreditCardMainFrame extends MainFrame {

	/**
	 * Dung Le 
	 */
	private static final long serialVersionUID = 54604709938475662L;

	javax.swing.JButton buttonAddNewCCard = new javax.swing.JButton();
	javax.swing.JButton buttonGenBill = new javax.swing.JButton();
	
	private CreditCardController control;
	
	public CreditCardMainFrame(String title) {
		super();
		control = CreditCardController.getInstance();

		frameJPanel.setBounds(0, 0, 575, 310);
		this.setTitle(title);
		buttonAddNewCCard.setText("Add New Credit Card");
		frameJPanel.add(buttonAddNewCCard);
		buttonAddNewCCard.setBounds(24, 20, 192, 33);
		buttonGenBill.setText("Generate Monthly Bills");
		buttonGenBill.setActionCommand("jGenButton");
		frameJPanel.add(buttonGenBill);
		buttonGenBill.setBounds(240, 20, 192, 33);
		
		buttonAddNewCCard.addActionListener(control
				.getNewCreditCardAccountListener(this));
		buttonGenBill
				.addActionListener(control.getGenerateBillListener(this));
		
		withdrawButton.setText("Charge");
		frameJPanel.add(withdrawButton);
		withdrawButton.setBounds(468, 164, 96, 33);
		
		

	}

	static public void main(String args[]) {
		try {
			// Add the following code if you want the Look and Feel
			// to be set to the Look and Feel of the native system.

			try {
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			}

			// Create a new instance of our application's frame, and make it
			// visible.
			(new CreditCardMainFrame("Credit Card Application"))
					.setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

}
