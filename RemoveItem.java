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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 

public class RemoveItem extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Resturant name");
		
		GridPane gridPane = addNewItem();
		addControls(gridPane);
		
		Scene scene = new Scene(gridPane, 800, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private GridPane addNewItem()
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
        
		Label headerLabel = new Label("Remove Menu Item");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(headerLabel, 0,1,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));
        
        Label update = new Label("Enter Item to Remove");
        update.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        gridPane.add(update, 0, 2, 2, 1);
        GridPane.setHalignment(update, HPos.LEFT);
        
        // Add Section Label
        Label sectionLabel = new Label("Section : ");
        gridPane.add(sectionLabel, 0, 3);

        // Add Section Text Field
        TextField sectionField = new TextField();
        sectionField.setPrefHeight(40);
        gridPane.add(sectionField, 1, 3);
        
        // Add Name Label
        Label nameLabel = new Label("Name : ");
        gridPane.add(nameLabel, 0,4);

        // Add Name Text Field
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        gridPane.add(nameField, 1,4);
        
        // Add Price Label
        Label priceLabel = new Label("Price : ");
        gridPane.add(priceLabel, 0,5);

        // Add Price Text Field
        TextField priceField = new TextField();
        priceField.setPrefHeight(40);
        gridPane.add(priceField, 1,5);
        
        // Add Ingredients Label
        Label ingredientsLabel = new Label("Ingredients : ");
        gridPane.add(ingredientsLabel, 0,6);

        // Add Ingredients Text Field
        TextField ingredientsField = new TextField();
        ingredientsField.setPrefHeight(40);
        gridPane.add(ingredientsField, 1,6);
        
        // Add Image Label
        Label imageLabel = new Label("Image URL : ");
        gridPane.add(imageLabel, 0,7);

        // Add Image Text Field
        TextField imageField = new TextField();
        imageField.setPrefHeight(40);
        gridPane.add(imageField, 1,7);
        
        // Add Submit Button
        Button submitButton = new Button("Update Item");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 8, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(10, 0,10,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(sectionField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a section for the item");
                    return;
                }
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a name for the item");
                    return;
                }             
                if(priceField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a price for the item");
                    return;
                }
                if(ingredientsField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter ingredients for the item");
                    return;
                }
                if(imageField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter an image for the item");
                    return;
                }
                
                //LOOP THROUGH MENU ARRAYLIST AND REMOVE ITEM 
                for(int i = 0; i < menuList.size(); i++)
                {
                	String name = menuList.get(i).getName();
                	String section = menuList.get(i).getType();
                	double price = menuList.get(i).getPrice();
                	String ingredients = menuList.get(i).getIngredients();
                	
                	if(name.equals(nameField.getText()))
                	{
                		if(section.equals(sectionField.getText()))
                		{
                			if(price == Double.valueOf(priceField.getText()))
                			{
                				if(ingredients.equals(ingredientsField.getText()))
                				{
                					menuList.remove(i);
                				}
                			}
                		}
                	}
                	else
                	{
                		showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Menu Item not Found");
                        return;
                	}
                }
                //ADD ERROR MESSAGE AND RETURN IF ITEM IS NOT FOUND
                
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Item Removed Successfully!", "");
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
