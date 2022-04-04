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

public class ResturantProfile extends Application 
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
        
		Label headerLabel = new Label("Successfully Logged In! Welcome Back!");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(headerLabel, 0,1,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));
        
        // Add Button to Lead to Adding New Item
        Button addButton = new Button("Add New Item");
        addButton.setPrefHeight(40);
        addButton.setDefaultButton(true);
        addButton.setPrefWidth(100);
        gridPane.add(addButton, 0, 3, 2, 1);
        GridPane.setHalignment(addButton, HPos.CENTER);
        GridPane.setMargin(addButton, new Insets(20, 0,20,0));
        
        // Add Button to Lead to Updating an Item
        Button updateButton = new Button("Update Item");
        updateButton.setPrefHeight(40);
        updateButton.setDefaultButton(true);
        updateButton.setPrefWidth(100);
        gridPane.add(updateButton, 0, 4, 2, 1);
        GridPane.setHalignment(updateButton, HPos.CENTER);
        GridPane.setMargin(updateButton, new Insets(20, 0,20,0));
        
        // Add Button to Lead to Removing Item
        Button removeButton = new Button("Remove Item");
        removeButton.setPrefHeight(40);
        removeButton.setDefaultButton(true);
        removeButton.setPrefWidth(100);
        gridPane.add(removeButton, 0, 5, 2, 1);
        GridPane.setHalignment(removeButton, HPos.CENTER);
        GridPane.setMargin(removeButton, new Insets(20, 0,20,0));
        
        // Add Button to Lead to Adding Coupon
        Button couponButton = new Button("Create Coupon");
        couponButton.setPrefHeight(40);
        couponButton.setDefaultButton(true);
        couponButton.setPrefWidth(100);
        gridPane.add(couponButton, 0, 6, 2, 1);
        GridPane.setHalignment(couponButton, HPos.CENTER);
        GridPane.setMargin(couponButton, new Insets(20, 0,20,0));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}