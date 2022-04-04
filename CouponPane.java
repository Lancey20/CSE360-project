package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
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

public class CouponPane extends Application
{
	Coupon currentCoupon = new Coupon();
	
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Resturant name");
		
		GridPane gridPane = createCoupon();
		addControls(gridPane);
		
		Scene scene = new Scene(gridPane, 800, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private GridPane createCoupon()
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
	
	private void addControls(GridPane gridPane)
	{
		// Add Back to Account Button
        Button backButton = new Button("Back to Profile");
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
        
		Label headerLabel = new Label("Enter Information to Create Coupon");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(headerLabel, 0,1,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));

        Label contactInfo = new Label("Create Coupon Promotion");
        contactInfo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(contactInfo, 0, 2, 2, 1);
        GridPane.setHalignment(contactInfo, HPos.LEFT);
        
        // Add Code Label
        Label codeLabel = new Label("Code : ");
        gridPane.add(codeLabel, 0,3);

        // Add Code Text Field
        TextField codeField = new TextField();
        codeField.setPrefHeight(40);
        gridPane.add(codeField, 1,3);
        
        // Add Discount Label
        Label discountLabel = new Label("Discount : ");
        gridPane.add(discountLabel, 0,4);

        // Add Discount Text Field
        TextField discountField = new TextField();
        discountField.setPrefHeight(40);
        gridPane.add(discountField, 1,4);
        
        // Add Submit Button
        Button submitButton = new Button("Create Coupon");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 5, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(10, 0,10,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(codeField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your a coupon code");
                    return;
                }
                if(discountField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a discount amount");
                    return;
                }             
                
                double discount = Double.valueOf(discountField.getText());
                currentCoupon.createCoupon(codeField.getText(), discount);
                
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Coupon Creation Successful!", "");
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
