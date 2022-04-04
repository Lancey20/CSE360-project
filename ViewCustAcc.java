package project360;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.geometry.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ViewCustAcc extends BorderPane{
	private Button leftHeader;
	private Label rightHeader;
	private GridPane headerBox;
	private Label cLabel;
	
	private Label nameLab;
	private Label phoneLab;
	private Label emailLab;

	private TextField nameText;
	private TextField phoneText;
	private TextField emailText;
	
	private Label midLabel;
	
	private Label cardName;
	private Label billAddress;
	private Label cardNum;
	private Label ccvNum;
	private Label expDate;
	
	private TextField cardNameText;
	private TextArea billAddressText;
	private TextField cardNumText;
	private TextField ccvText;
	private TextField expDateText;
	
	private Button updateAccBut;
	private GridPane mainPane;
	
	public ViewCustAcc() {
		leftHeader = new Button("Back to Menu");
		rightHeader = new Label("RESTAURANT NAME HERE");
		headerBox = new GridPane();
		cLabel = new Label("Saved Contact Information");
		
		//labels in cLabelBox here above cLabelBox
		nameLab = new Label("Full Name");
		phoneLab = new Label("Phone Number");
		emailLab = new Label("Email");
		
		//textboxes in cTextBox here above cTextBox
		nameText = new TextField("John Doe");
		phoneText = new TextField("4801234567");
		emailText = new TextField("email@gmail.com");
		
		midLabel = new Label("Saved Payment Information");
		
		//labels in pLabelBox here above pLabelBox
		cardName = new Label("Name on Card");
		billAddress = new Label("Billing Address");
		cardNum = new Label("Card Number");
		ccvNum = new Label("CCV Number");
		expDate = new Label("Expiration Date");
		//pLabelBox = new VBox();
		//pLabelBox.getChildren().addAll(cardName, billAddress, new Label(""), cardNum, ccvNum, expDate);
		
		//labels in pTextBox here above pTextBox
		cardNameText = new TextField("John Doe");
		billAddressText = new TextArea("1151 S Forest Ave\nTempe, AZ 85281");
		billAddressText.setPrefColumnCount(15);
		billAddressText.setPrefRowCount(2);
		cardNumText = new TextField("1234 5678 9101 1121");
		ccvText = new TextField("321");
		expDateText = new TextField("01/23");
		//pTextBox = new VBox(5);
		//pTextBox.getChildren().addAll(cardNameText, billAddressText, cardNumText, ccvText, expDateText);
		
		updateAccBut = new Button("Update Account Information");
		BorderPane.setAlignment(updateAccBut, Pos.CENTER_RIGHT);
		mainPane = new GridPane();
		
		//headerBox.setAlignment(Pos.CENTER);
		headerBox.add(leftHeader, 0, 0);
		headerBox.add(rightHeader, 1, 0);
		headerBox.add(new Label(), 2, 0);
		headerBox.setHgap(10);
		//make mainPane GridPane
		mainPane.add(cLabel, 0, 0);
		mainPane.add(nameLab, 0, 1);
		mainPane.add(nameText, 1, 1);
		mainPane.add(phoneLab, 0, 2);
		mainPane.add(phoneText, 1, 2);
		mainPane.add(emailLab, 0, 3);
		mainPane.add(emailText, 1, 3);
		mainPane.add(midLabel,  0, 4);
		mainPane.add(cardName, 0, 5);
		mainPane.add(cardNameText, 1, 5);
		mainPane.add(billAddress, 0, 6);
		mainPane.add(billAddressText, 1, 6);
		mainPane.add(cardNum, 0, 7);
		mainPane.add(cardNumText, 1, 7);
		mainPane.add(ccvNum, 0, 8);
		mainPane.add(ccvText, 1, 8);
		mainPane.add(expDate, 0, 9);
		mainPane.add(expDateText, 1, 9);
		
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setHgap(10);
		mainPane.setVgap(10);
		
		this.setPadding(new Insets(25,25,25,25));
		this.setTop(headerBox);
		this.setCenter(mainPane);
		this.setBottom(updateAccBut);
		
		//handlers
		ButtonHandler aHandler = new ButtonHandler();
		leftHeader.setOnAction(aHandler);
		updateAccBut.setOnAction(aHandler);
	}
	
	private class ButtonHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
		//	try {
				if(event.getSource() == leftHeader) {
					//this is just to show the button works
					leftHeader.setText("you clicked me");
					
					//TODO: change scene to landing page
				}
				if(event.getSource() == updateAccBut) {
					//this is just to show the button works
					updateAccBut.setText("you clicked me");
					
					//TODO: update the account with all info from TextFields
					//should already be signed in
					//all TextFields should be autofilled and should set all values 
					//(not the most efficient manner, but it should work)
				}
		//	}
		}
	}

}
