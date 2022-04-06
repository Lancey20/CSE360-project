package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Window;
import javafx.scene.Cursor;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		
		  // creating labels 
		  Button sides = new Button("Sides");
		  sides.setFont(Font.font ("Arial", 15));
		  sides.setStyle("-fx-base: #c1dbb3; ");
		  sides.setPrefHeight(25);
		  sides.setDefaultButton(false); 
		  sides.setPrefWidth(115);
		  
		  Button entrees = new Button("Entrees");
		  entrees.setFont(Font.font ("Arial", 15));
		  entrees.setStyle("-fx-base: #c1dbb3; ");
		  entrees.setPrefHeight(25);
		  entrees.setDefaultButton(false); 
		  entrees.setPrefWidth(115);
		  
		  Button beverages = new Button("Beverages");
		  beverages.setFont(Font.font ("Arial", 15));
		  beverages.setStyle("-fx-base: #c1dbb3; ");
		  beverages.setPrefHeight(25);
		  beverages.setDefaultButton(false); 
		  beverages.setPrefWidth(115);
		  
		  // search text field 
		  TextField search = new TextField("search");
		  search.setPrefHeight(30); 
		  search.setPrefWidth(100);
		 
		  // outline food description
		  Rectangle rect1 = new Rectangle();
		  rect1.setFill(Color.TRANSPARENT);
		  rect1.setStroke(Color.BLACK);
		  rect1.setWidth(450);
		  rect1.setHeight(85);
		  Rectangle rect2 = new Rectangle();
		  rect2.setFill(Color.TRANSPARENT);
		  rect2.setStroke(Color.BLACK);
		  rect2.setWidth(450);
		  rect2.setHeight(85);
		  Rectangle rect3 = new Rectangle();
		  rect3.setFill(Color.TRANSPARENT);
		  rect3.setStroke(Color.BLACK);
		  rect3.setWidth(450);
		  rect3.setHeight(85);
		  Rectangle rect4 = new Rectangle();
		  rect4.setFill(Color.TRANSPARENT);
		  rect4.setStroke(Color.BLACK);
		  rect4.setWidth(450);
		  rect4.setHeight(85);
		  Rectangle rect5 = new Rectangle();
		  rect5.setFill(Color.TRANSPARENT);
		  rect5.setStroke(Color.BLACK);
		  rect5.setWidth(450);
		  rect5.setHeight(85);
		  Rectangle rect6 = new Rectangle();
		  rect6.setFill(Color.TRANSPARENT);
		  rect6.setStroke(Color.BLACK);
		  rect6.setWidth(450);
		  rect6.setHeight(85);
		  Rectangle rect7 = new Rectangle();
		  rect7.setFill(Color.TRANSPARENT);
		  rect7.setStroke(Color.BLACK);
		  rect7.setWidth(450);
		  rect7.setHeight(85);
		  Rectangle rect8 = new Rectangle();
		  rect8.setFill(Color.TRANSPARENT);
		  rect8.setStroke(Color.BLACK);
		  rect8.setWidth(450);
		  rect8.setHeight(85);
		  Rectangle rect9 = new Rectangle();
		  rect9.setFill(Color.TRANSPARENT);
		  rect9.setStroke(Color.BLACK);
		  rect9.setWidth(450);
		  rect9.setHeight(85);
		  Rectangle rect10 = new Rectangle();
		  rect10.setFill(Color.TRANSPARENT);
		  rect10.setStroke(Color.BLACK);
		  rect10.setWidth(450);
		  rect10.setHeight(85);
		  Rectangle rect11 = new Rectangle();
		  rect11.setFill(Color.TRANSPARENT);
		  rect11.setStroke(Color.BLACK);
		  rect11.setWidth(450);
		  rect11.setHeight(85);
		  Rectangle rect12 = new Rectangle();
		  rect12.setFill(Color.TRANSPARENT);
		  rect12.setStroke(Color.BLACK);
		  rect12.setWidth(450);
		  rect12.setHeight(85);
		  
		  
		  
		  
		  // food items 
		  Label friestext = new Label("Fries"); 
		  friestext.setStyle("-fx-font: 15 arial; ");
		  friestext.setTranslateX(-80);
		  friestext.setTranslateY(-20);
		  Label mactext = new Label("Mac N Cheese"); 
		  mactext.setStyle("-fx-font: 15 arial; ");
		  mactext.setTranslateX(-80);
		  mactext.setTranslateY(-20);
		  Label curdstext = new Label("Cheese Curds"); 
		  curdstext.setStyle("-fx-font: 15 arial; ");
		  curdstext.setTranslateX(-80);
		  curdstext.setTranslateY(-20);
		  Label cheesebtext = new Label("Cheese"); 
		  cheesebtext.setStyle("-fx-font: 15 arial; ");
		  cheesebtext.setTranslateX(-80);
		  cheesebtext.setTranslateY(-20);
		  cheesebtext.setPrefWidth(250);
		  Label bacontext = new Label("Bacon"); 
		  bacontext.setStyle("-fx-font: 15 arial; ");
		  bacontext.setTranslateX(-80);
		  bacontext.setTranslateY(-20);
		  Label chickentext = new Label("Chicken"); 
		  chickentext.setStyle("-fx-font: 15 arial; ");
		  chickentext.setTranslateX(-80);
		  chickentext.setTranslateY(-20);
		  Label impossibletext = new Label("Impossible"); 
		  impossibletext.setStyle("-fx-font: 15 arial; ");
		  impossibletext.setTranslateX(-80);
		  impossibletext.setTranslateY(-20);
		  Label doubletext = new Label("Double"); 
		  doubletext.setStyle("-fx-font: 15 arial; ");
		  doubletext.setTranslateX(-80);
		  doubletext.setTranslateY(-20);
		  Label stripstext = new Label("Chicken Strips"); 
		  stripstext.setStyle("-fx-font: 15 arial; ");
		  stripstext.setTranslateX(-80);
		  stripstext.setTranslateY(-20);
		  Label sodatext = new Label("Soda"); 
		  sodatext.setStyle("-fx-font: 15 arial; ");
		  sodatext.setTranslateX(-80);
		  sodatext.setTranslateY(-20);
		  Label watertext = new Label("Water"); 
		  watertext.setStyle("-fx-font: 15 arial; ");
		  watertext.setTranslateX(-80);
		  watertext.setTranslateY(-20);
		  Label lemonadetext = new Label("Lemonade"); 
		  lemonadetext.setStyle("-fx-font: 15 arial; ");
		  lemonadetext.setTranslateX(-80);
		  lemonadetext.setTranslateY(-20);
		  
		  
		// images 
		ImageView fries = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/fries.jpg")));
		fries.setFitHeight(85);
		fries.setFitWidth(115);
		
		ImageView macncheese = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/macncheese.jpg")));
		macncheese.setFitHeight(85);
		macncheese.setPreserveRatio(true);
		
		ImageView cheesecurds = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/cheesecurds.jpg")));
		cheesecurds.setFitHeight(85);
		cheesecurds.setFitWidth(115);

		ImageView cheeseburger = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/cheeseburger.jpg")));
		cheeseburger.setFitHeight(85);
		cheeseburger.setPreserveRatio(true);
		
		ImageView bacon = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/bacon.jpeg")));
		bacon.setFitHeight(85);
		bacon.setPreserveRatio(true);
		
		ImageView chickensando = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/chickensando.jpg")));
		chickensando.setFitHeight(85);
		chickensando.setFitWidth(115);
		
		ImageView impossible = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/impossible.jpeg")));
		impossible.setFitHeight(85);
		impossible.setFitWidth(115);
		
		ImageView doublecheese = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/doublecheese.jpg")));
		doublecheese.setFitHeight(85);
		doublecheese.setFitWidth(115);
		
		ImageView tenders = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/tenders.jpg")));
		tenders.setFitHeight(85);
		tenders.setPreserveRatio(true);
		
		ImageView soda = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/soda.jpeg")));
		soda.setFitHeight(85);
		soda.setFitWidth(115);
		
		ImageView water = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/water.jpg")));
		water.setFitHeight(85);
		water.setFitWidth(115);

		ImageView lemonade = new ImageView(new Image(new FileInputStream("C:/Users/cluec/Pictures/lemonade.jpg")));
		lemonade.setFitHeight(85);
		lemonade.setFitWidth(115);
	
		  // buttons 
		  Button loginButton = new Button("Login");
		  loginButton.setStyle("-fx-font: 18 arial; ");
		  loginButton.setStyle("-fx-base: #fec89a; "); 
		  loginButton.setPrefHeight(30);
		  loginButton.setDefaultButton(true); 
		  loginButton.setPrefWidth(60);
		  
		  Button cartButton = new Button("Cart");
		  cartButton.setStyle("-fx-font: 18 arial; ");
		  cartButton.setStyle("-fx-base: #fec89a; "); 
		  cartButton.setPrefHeight(30);
		  cartButton.setDefaultButton(true); 
		  cartButton.setPrefWidth(60);
		  
		  Button addButton = new Button("add to cart"); 
		  addButton.setPrefHeight(30);
		  addButton.setDefaultButton(true); 
		  addButton.setPrefWidth(100); 

		GridPane gridPane = new GridPane();
		gridPane.setMinSize(800, 1000);
		
		gridPane.getColumnConstraints().add(new ColumnConstraints(80));
		gridPane.getColumnConstraints().add(new ColumnConstraints(130));
		gridPane.getColumnConstraints().add(new ColumnConstraints(100));
		gridPane.getColumnConstraints().add(new ColumnConstraints(100));
		gridPane.getColumnConstraints().add(new ColumnConstraints(80));
		gridPane.getColumnConstraints().add(new ColumnConstraints(90));
		gridPane.getColumnConstraints().add(new ColumnConstraints(100));
		gridPane.getColumnConstraints().add(new ColumnConstraints(60));
		gridPane.getRowConstraints().add(new RowConstraints(50));
		gridPane.getRowConstraints().add(new RowConstraints(50));
		gridPane.getRowConstraints().add(new RowConstraints(70));
		gridPane.getRowConstraints().add(new RowConstraints(120));
		gridPane.getRowConstraints().add(new RowConstraints(70));
		gridPane.getRowConstraints().add(new RowConstraints(50));
		gridPane.getRowConstraints().add(new RowConstraints(70));
		gridPane.getRowConstraints().add(new RowConstraints(120));
		gridPane.getRowConstraints().add(new RowConstraints(70));
		gridPane.getRowConstraints().add(new RowConstraints(120));
		gridPane.getRowConstraints().add(new RowConstraints(70));
		gridPane.getRowConstraints().add(new RowConstraints(120));
		gridPane.getRowConstraints().add(new RowConstraints(10));
		gridPane.getRowConstraints().add(new RowConstraints(100));
		gridPane.getRowConstraints().add(new RowConstraints(90));
		gridPane.getRowConstraints().add(new RowConstraints(100));
		
		// alignment 
		gridPane.add(loginButton, 0, 0);
		 gridPane.add(cartButton, 7, 0);
		 gridPane.add(search, 5, 0); 
		  
		 gridPane.add(sides, 1, 1);
		 gridPane.add(fries, 1, 2);
		 gridPane.add(macncheese, 1, 3);
		 gridPane.add(cheesecurds, 1, 4);
		 gridPane.add(entrees, 1, 5);
		 gridPane.add(cheeseburger, 1, 6);
		 gridPane.add(bacon, 1, 7);
		 gridPane.add(chickensando, 1, 8);
		 gridPane.add(impossible, 1, 9);
		 gridPane.add(doublecheese, 1, 10);
		 gridPane.add(tenders, 1, 11);
		 gridPane.add(beverages, 1, 12);
		 gridPane.add(soda, 1, 13);
		 gridPane.add(water, 1, 14);
		 gridPane.add(lemonade, 1, 15);
		 
		 gridPane.add(rect1, 2, 2);
		 gridPane.add(rect2, 2, 3);
		 gridPane.add(rect3, 2, 4);
		 gridPane.add(rect4, 2, 6);
		 gridPane.add(rect5, 2, 7);
		 gridPane.add(rect6, 2, 8);
		 gridPane.add(rect7, 2, 9);
		 gridPane.add(rect8, 2, 10);
		 gridPane.add(rect9, 2, 11);
		 gridPane.add(rect10, 2, 13);
		 gridPane.add(rect11, 2, 14);
		 gridPane.add(rect12, 2, 15);
		 
		 gridPane.add(friestext, 3, 2);
		 gridPane.add(mactext, 3, 3);
		 gridPane.add(curdstext, 3, 4);
		 gridPane.add(cheesebtext, 3, 6);
		 gridPane.add(bacontext, 3, 7);
		 gridPane.add(chickentext, 3, 8);
		 gridPane.add(impossibletext, 3, 9);
		 gridPane.add(doubletext, 3, 10);
		 gridPane.add(stripstext, 3, 11);
		 gridPane.add(sodatext, 3, 13);
		 gridPane.add(watertext, 3, 14);
		 gridPane.add(lemonadetext, 3, 15);
		  
		 
		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(755, 800);
		scroll.setContent(gridPane);

		Scene scene = new Scene(scroll);

		primaryStage.setTitle("Restaurant Name");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
