package CCardApp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import framework.view.AddAccountFrame;
import framework.view.MainFrame;
import CCardApp.view.AddCreditcardFrame;
import CCardApp.view.CreditCardMainFrame;

public class CreditCardController {

	private CreditCardMainFrame creditCardFrame;

	private static CreditCardController instance;

	private AddAccountFrame addAccountFrame;
	private String creditCardType;
	private CreditCardController() {
	}

	public static CreditCardController getInstance() {
		if (instance == null) {
			instance = new CreditCardController();
		}
		return instance;
	}

	class AddNewCCardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			AddCreditcardFrame addCreditCardFrame = new AddCreditcardFrame(
					creditCardFrame);
			addCreditCardFrame.setVisible(true);
		}

	}

	class GenerateBillListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		}

	}

	public ActionListener getAddNewCreditCardListener(MainFrame frame) {

		return new AddNewCCardListener();

	}

	public ActionListener getGenerateBillListener(MainFrame frame) {
		return new GenerateBillListener();

	}

	public ActionListener getAddNewCreditCardOkListener(
			AddAccountFrame frame) {
		addAccountFrame = frame;
		return new AddNewCreditCardOKListener();
	}
	
	class AddNewCreditCardOKListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {



		}

	}
	
	public java.awt.event.MouseListener getRadioButtonGoldListener() {
		return new RadioButtonGoldListener();
	}

	public java.awt.event.MouseListener getRadioButtonSilverListener() {
		return new RadioButtonSilverListener();
	}

	public java.awt.event.MouseListener getRadioButtonBronzeListener() {
		return new RadioButtonBronzeListener();
	}
	
	class RadioButtonGoldListener extends java.awt.event.MouseAdapter {
		public void mouseClicked(java.awt.event.MouseEvent event) {
			creditCardType = "Gold";
		}
	}

	class RadioButtonBronzeListener extends java.awt.event.MouseAdapter {
		public void mouseClicked(java.awt.event.MouseEvent event) {
			creditCardType = "Bronze";
		}
	}

	class RadioButtonSilverListener extends java.awt.event.MouseAdapter {
		public void mouseClicked(java.awt.event.MouseEvent event) {
			creditCardType = "Silver";
		}
	}
}
