package application;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.geometry.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ViewCustAcc extends BorderPane{
	
	Button menuBut;
	Button updateAccBut;
	
	public ViewCustAcc() {
		
		GridPane gridPane = createCustAccView();
		addControls(gridPane);
		this.setCenter(gridPane);
		
	}
	
	
	private GridPane createCustAccView() {
		
		GridPane gridPane = new GridPane();
		
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.setPadding(new Insets(40, 40, 40, 40));
		
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 200, Double.MAX_VALUE);
		columnOneConstraints.setHalignment(HPos.RIGHT);
		
		ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstraints);

        return gridPane;
		
	}
	
	private void addControls(GridPane gridPane) {
		
		//back to menu button
        menuBut = new Button("Back to Menu");
        menuBut.setPrefHeight(40);
        menuBut.setDefaultButton(true);
        menuBut.setPrefWidth(100);
        gridPane.add(menuBut, 0, 0, 2, 1);
        GridPane.setHalignment(menuBut, HPos.LEFT);
        GridPane.setMargin(menuBut, new Insets(10, 0,10,0));
        
        Label restaurantName = new Label("RESTAURANT NAME HERE");
        restaurantName.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        gridPane.add(restaurantName, 0,0,2,1);
        GridPane.setHalignment(restaurantName, HPos.CENTER);
        GridPane.setMargin(restaurantName, new Insets(10, 0,10,0));
		
		updateAccBut = new Button("Update Account Information");
		GridPane.setHalignment(updateAccBut, HPos.RIGHT);
        GridPane.setMargin(updateAccBut, new Insets(10, 0,10,0));
		
		Label cLabel = new Label("Saved Contact Information");
		
		//labels in cLabelBox here above cLabelBox
		Label nameLab = new Label("Full Name");
		Label phoneLab = new Label("Phone Number");
		Label emailLab = new Label("Email");
		
		//textboxes in cTextBox here above cTextBox
		TextField nameText = new TextField("John Doe");
		TextField phoneText = new TextField("4801234567");
		TextField emailText = new TextField("email@gmail.com");
		
		Label midLabel = new Label("Saved Payment Information");
		midLabel.setWrapText(true);
		
		//labels in pLabelBox here above pLabelBox
		Label cardName = new Label("Name on Card");
		Label billAddress = new Label("Billing Address");
		Label cardNum = new Label("Card Number");
		Label ccvNum = new Label("CCV Number");
		Label expDate = new Label("Expiration Date");
		
		//labels in pTextBox here above pTextBox
		TextField cardNameText = new TextField("John Doe");
		TextArea billAddressText = new TextArea("1151 S Forest Ave\nTempe, AZ 85281");
		billAddressText.setPrefColumnCount(15);
		billAddressText.setPrefRowCount(2);
		TextField cardNumText = new TextField("1234 5678 9101 1121");
		TextField ccvText = new TextField("321");
		TextField expDateText = new TextField("01/23");
				
		
		//make gridPane GridPane
		gridPane.add(cLabel, 0, 1);
		gridPane.add(nameLab, 0, 2);
		gridPane.add(nameText, 1, 2);
		gridPane.add(phoneLab, 0, 3);
		gridPane.add(phoneText, 1, 3);
		gridPane.add(emailLab, 0, 4);
		gridPane.add(emailText, 1, 4);
		gridPane.add(midLabel,  0, 5);
		gridPane.add(cardName, 0, 6);
		gridPane.add(cardNameText, 1, 6);
		gridPane.add(billAddress, 0, 7);
		gridPane.add(billAddressText, 1, 7);
		gridPane.add(cardNum, 0, 8);
		gridPane.add(cardNumText, 1, 8);
		gridPane.add(ccvNum, 0, 9);
		gridPane.add(ccvText, 1, 9);
		gridPane.add(expDate, 0, 10);
		gridPane.add(expDateText, 1, 10);
		gridPane.add(updateAccBut, 1, 11);
		
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		
		
		updateAccBut.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	            if(nameText.getText().isEmpty() || phoneText.getText().isEmpty() || emailText.getText().isEmpty() || 
	            		cardNameText.getText().isEmpty() || billAddressText.getText().isEmpty() || cardNumText.getText().isEmpty() || 
	            		ccvText.getText().isEmpty() || expDateText.getText().isEmpty()) 
	            {
	                alert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please complete all fields");
	                return;
	            }
	            //TODO: find the customer (search by name), set each attribute value to the getText() of the corresponding fields
	            //		this is hardcoded rn, but needs to be updated
	            alert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Information Updated!", "");
	        }
	    });

	}
	
	private void alert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alertMsg = new Alert(alertType);
        alertMsg.setTitle(title);
        alertMsg.setHeaderText(null);
        alertMsg.setContentText(message);
        alertMsg.initOwner(owner);
        alertMsg.show();
	}
	
	public void menuBut(Stage stage, Scene scene) {
		menuBut.setOnAction(e -> stage.setScene(scene));
	}

}
	 



