package CCardApp.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.UIManager;

import framework.view.MainFrame;

public class CreditcardFrame extends MainFrame {

	/**
	 * Dung Le 
	 */
	private static final long serialVersionUID = 54604709938475662L;

	javax.swing.JButton JButton_NewCCAccount = new javax.swing.JButton();
	javax.swing.JButton JButton_GenBill = new javax.swing.JButton();
	

	public CreditcardFrame(String title) {
		super();
		JPanel JPanel1 = new JPanel();
		JPanel1.setLayout(null);
		getContentPane().add(BorderLayout.CENTER, JPanel1);
		JPanel1.setBounds(0, 0, 575, 310);
		this.setTitle(title);
		JButton_NewCCAccount.setText("Add Credit Card account");
		JPanel1.add(JButton_NewCCAccount);
		JButton_NewCCAccount.setBounds(24, 20, 192, 33);
		JButton_GenBill.setText("Generate Monthly Bills");
		JButton_GenBill.setActionCommand("jGenButton");
		JPanel1.add(JButton_GenBill);
		JButton_GenBill.setBounds(240, 20, 192, 33);
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
			(new CreditcardFrame("Credit Card Application"))
					.setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

}
