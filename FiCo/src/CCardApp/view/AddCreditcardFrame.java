package CCardApp.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.UIManager;

import framework.view.AddAccountFrame;
import framework.view.MainFrame;

public class AddCreditcardFrame extends AddAccountFrame {

	/**
	 * Dung Le
	 */
	private static final long serialVersionUID = 1L;
	javax.swing.JLabel JLabel6 = new javax.swing.JLabel();
	javax.swing.JLabel Label7 = new javax.swing.JLabel();
	javax.swing.JTextField JTextField_CCNR = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_ExpDate = new javax.swing.JTextField();
	javax.swing.JRadioButton JRadioButton_Gold = new javax.swing.JRadioButton();
	javax.swing.JRadioButton JRadioButton_Silver = new javax.swing.JRadioButton();
	javax.swing.JRadioButton JRadioButton_Bronze = new javax.swing.JRadioButton();

	public AddCreditcardFrame(MainFrame parent) {
		super(parent);
		getContentPane().setLayout(null);
		setSize(301,373);
		
		JRadioButton_Gold.setText("Gold");
		JRadioButton_Gold.setActionCommand("Gold");
		getContentPane().add(JRadioButton_Gold);
		JRadioButton_Gold.setBounds(36, 12, 84, 24);

		JRadioButton_Silver.setText("Silver");
		JRadioButton_Silver.setActionCommand("Silver");
		getContentPane().add(JRadioButton_Silver);
		JRadioButton_Silver.setBounds(36, 36, 84, 24);

		JRadioButton_Bronze.setText("Bronze");
		JRadioButton_Bronze.setActionCommand("Bronze");
		getContentPane().add(JRadioButton_Bronze);
		JRadioButton_Bronze.setBounds(36, 60, 84, 24);

		getContentPane().add(JTextField_CCNR);
		JTextField_CCNR.setBounds(84, 252, 156, 20);

		getContentPane().add(JTextField_ExpDate);
		JTextField_ExpDate.setBounds(84, 276, 156, 20);

		JLabel6.setText("CC number");
		getContentPane().add(JLabel6);
		JLabel6.setForeground(java.awt.Color.black);
		JLabel6.setBounds(12, 252, 96, 24);
		Label7.setText("Exp. Date");
		getContentPane().add(Label7);
		Label7.setForeground(java.awt.Color.black);
		Label7.setBounds(12, 276, 72, 24);

	}

}
