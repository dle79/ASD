package CCardApp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import framework.view.MainFrame;
import CCardApp.view.AddCreditcardFrame;
import CCardApp.view.CreditCardMainFrame;

public class CreditCardController {

	private CreditCardMainFrame creditCardFrame;

	private static CreditCardController instance;

	private CreditCardController() {
	}

	public static CreditCardController getInstance() {
		if (instance == null) {
			instance = new CreditCardController();
		}
		return instance;
	}

	class NewAccountListener implements ActionListener {

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

	public ActionListener getNewCreditCardAccountListener(MainFrame frame) {

		return new NewAccountListener();

	}

	public ActionListener getGenerateBillListener(MainFrame frame) {
		return new GenerateBillListener();

	}

}
