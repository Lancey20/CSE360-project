package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Window;

public class createAccount extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Resturant name");
		
		GridPane gridPane = createAccountInfo();
		addControls(gridPane);
		
		Scene scene = new Scene(gridPane, 800, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private GridPane createAccountInfo()
	{
		GridPane gridPane = new GridPane();
		
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.setPadding(new Insets(40, 40, 40, 40));
		
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
		columnOneConstraints.setHalignment(HPos.RIGHT);
		
		ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstraints);

        return gridPane;
	}

/*
 * Everything is set up, but still need to implement the actual storing of the information - need the user
 * class to be able to do so
 * 
 * to go between pages there are 2 buttons: the back to menu button and the create account button	
 */
	private void addControls(GridPane gridPane)
	{
		// Add Back to Menu Button
        Button backButton = new Button("Back to Menu");
        backButton.setPrefHeight(40);
        backButton.setDefaultButton(true);
        backButton.setPrefWidth(100);
        gridPane.add(backButton, 0, 0, 2, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(10, 0,10,0));
        
        Label resturantLabel = new Label("Resturant Name");
        resturantLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        gridPane.add(resturantLabel, 0,0,2,1);
        GridPane.setHalignment(resturantLabel, HPos.CENTER);
        GridPane.setMargin(resturantLabel, new Insets(10, 0,10,0));
        
		Label headerLabel = new Label("Enter Your Information to Create an Account");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(headerLabel, 0,1,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));

        Label contactInfo = new Label("Enter Your Contact Information");
        contactInfo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(contactInfo, 0, 2, 2, 1);
        GridPane.setHalignment(contactInfo, HPos.LEFT);
        
        // Add Name Label
        Label nameLabel = new Label("Full Name : ");
        gridPane.add(nameLabel, 0,3);

        // Add Name Text Field
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        gridPane.add(nameField, 1,3);

        // Add Phone Number Label
        Label phoneNumLabel = new Label("Phone Number : ");
        gridPane.add(phoneNumLabel, 0, 4);

        // Add Phone Number Text Field
        TextField phoneNumField = new TextField();
        phoneNumField.setPrefHeight(40);
        gridPane.add(phoneNumField, 1, 4);
        
        // Add Email Label
        Label emailLabel = new Label("Email : ");
        gridPane.add(emailLabel, 0, 5);

        // Add Email Text Field
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 5);

        // Add Password Label
        Label passwordLabel = new Label("Password : ");
        gridPane.add(passwordLabel, 0, 6);

        // Add Password Field
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 6);

        Label paymentInfo = new Label("Enter Your Payment Information");
        paymentInfo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(paymentInfo, 0, 7, 2, 1);
        GridPane.setHalignment(paymentInfo, HPos.LEFT);
        
        // Add Name on Card Label
        Label nameOnCardLabel = new Label("Name on Card : ");
        gridPane.add(nameOnCardLabel, 0, 8);

        // Add Name on Card Field
        TextField nameOnCardField = new TextField();
        nameOnCardField.setPrefHeight(40);
        gridPane.add(nameOnCardField, 1, 8);
        
        // Add Billing Address Label
        Label billingAddrLabel = new Label("Billing Address : ");
        gridPane.add(billingAddrLabel, 0, 9);

        // Add Billing Address Text Field
        TextField billingAddrField = new TextField();
        billingAddrField.setPrefHeight(40);
        gridPane.add(billingAddrField, 1, 9);
        
        // Add Card Number Label
        Label cardNumLabel = new Label("Card Number : ");
        gridPane.add(cardNumLabel, 0, 10);

        // Add Card Number Text Field
        TextField cardNumField = new TextField();
       	cardNumField.setPrefHeight(40);
        gridPane.add(cardNumField, 1, 10);
        
        // Add CCV Number Label
        Label ccvNumLabel = new Label("CCV Number : ");
        gridPane.add(ccvNumLabel, 0, 11);

        // Add Card Number Text Field
        TextField ccvNumField = new TextField();
       	ccvNumField.setPrefHeight(40);
        gridPane.add(ccvNumField, 1, 11);
        
        // Add Expiration Date Label
        Label exprDateLabel = new Label("Expiration Date : ");
        gridPane.add(exprDateLabel, 0, 12);

        // Add Expiration Date Text Field
        TextField exprDateField = new TextField();
       	exprDateField.setPrefHeight(40);
        gridPane.add(exprDateField, 1, 12);
        
        // Add Submit Button
        Button submitButton = new Button("Create Account");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 13, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(10, 0,10,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(phoneNumField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your phone number");
                    return;
                }
                if(emailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }
                if(nameOnCardField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a name for the credit card");
                    return;
                }
                if(billingAddrField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a billing address");
                    return;
                }
                if(cardNumField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a credit card number");
                    return;
                }
                if(ccvNumField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a CCV number");
                    return;
                }
                if(exprDateField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter an expiration date for the credit card");
                    return;
                }                
                
		int phoneNum = Integer.valueOf(phoneNumField.getText());
                int creditCard = Integer.valueOf(cardNumField.getText());
                int ccv = Integer.valueOf(ccvNumField.getText());
                User newUser = new User();
                newUser.createUser(nameField.getText(), passwordField.getText(), emailField.getText(), phoneNum, nameOnCardField.getText(), creditCard, billingAddrField.getText(), ccv, exprDateField.getText());
                
                userList.add(newUser); 
		
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
