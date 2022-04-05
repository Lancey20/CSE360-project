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
import javafx.scene.shape.Rectangle;
import javafx.stage.Window;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		GridPane gridPane = new GridPane();
		gridPane.setMinSize(600, 200);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(40, 40, 40, 40));
		// vertical and horizontal gaps between columns
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		Scene scene = new Scene(gridPane, 1000, 1000);
		primaryStage.setTitle("Restaurant Name");
		primaryStage.setHeight(850);
		primaryStage.setWidth(1200);
		
        ScrollPane scrollMenu = new ScrollPane();
        scrollMenu.setPrefSize(800, 500);
        scrollMenu.setContent(gridPane);

		// creating labels
		Label sides = new Label("Sides");
		sides.setTranslateX(-420);
		sides.setTranslateY(-270);
		sides.setStyle("-fx-font: 20 arial; ");
		
		Label entrees = new Label("Entrees");
		entrees.setTranslateX(-580);
		entrees.setTranslateY(10);
		entrees.setStyle("-fx-font: 20 arial; ");
		
		Label beverages = new Label("Beverages");
		beverages.setTranslateX(130);
		beverages.setTranslateY(-220);
		beverages.setStyle("-fx-font: 20 arial; ");

		// search textfield
		TextField search = new TextField("search");
		search.setTranslateX(440);
		search.setTranslateY(-320);
		
		// outline food items
		Rectangle rect1 = new Rectangle(10, 10, 200, 200);
		rect1.setFill(Color.TRANSPARENT);
		rect1.setStroke(Color.BLACK);
		rect1.setStrokeWidth(10);
		
		// food items
		Label fries = new Label("Fries");
		fries.setTranslateX(-470);
		fries.setTranslateY(-80);
		fries.setStyle("-fx-font: 15 arial; ");
		
		// images
		Image image1 = new Image(new FileInputStream("C:/Users/cluec/Pictures/fries.jpg"));
		ImageView imageView1 = new ImageView(image1);
		imageView1.setTranslateX(-410); 
	    imageView1.setTranslateY(-210);
	    imageView1.setFitHeight(100); 
	    imageView1.setFitWidth(100);
	    imageView1.setPreserveRatio(true);
	    
	    Image image2 = new Image(new FileInputStream("C:/Users/cluec/Pictures/macncheese.jpg"));
		ImageView imageView2 = new ImageView(image2);
		imageView2.setTranslateX(-410); 
	    imageView2.setTranslateY(-130);
	    imageView2.setFitHeight(100); 
	    imageView2.setFitWidth(100);
	    imageView2.setPreserveRatio(true);
	    
	    Image image3 = new Image(new FileInputStream("C:/Users/cluec/Pictures/cheesecurds.jpg"));
		ImageView imageView3 = new ImageView(image3);
		imageView3.setTranslateX(-410); 
	    imageView3.setTranslateY(-50);
	    imageView3.setFitHeight(100); 
	    imageView3.setFitWidth(100);
	    imageView3.setPreserveRatio(true);
	    
	    Image image4 = new Image(new FileInputStream("C:/Users/cluec/Pictures/cheeseburger.jpg"));
		ImageView imageView4 = new ImageView(image4);
		imageView4.setTranslateX(-410); 
	    imageView4.setTranslateY(70);
	    imageView4.setFitHeight(100); 
	    imageView4.setFitWidth(100);
	    imageView4.setPreserveRatio(true);
	    
	    Image image5 = new Image(new FileInputStream("C:/Users/cluec/Pictures/bacon.jpeg"));
		ImageView imageView5 = new ImageView(image5);
		imageView5.setTranslateX(-410); 
	    imageView5.setTranslateY(155);
	    imageView5.setFitHeight(100); 
	    imageView5.setFitWidth(100);
	    imageView5.setPreserveRatio(true);
	    
	    Image image6 = new Image(new FileInputStream("C:/Users/cluec/Pictures/chickensando.jpg"));
		ImageView imageView6 = new ImageView(image6);
		imageView6.setTranslateX(-400); 
	    imageView6.setTranslateY(240);
	    imageView6.setFitHeight(80); 
	    imageView6.setFitWidth(100);
	    imageView6.setPreserveRatio(true);
	    
	    Image image7 = new Image(new FileInputStream("C:/Users/cluec/Pictures/impossible.jpeg"));
		ImageView imageView7 = new ImageView(image7);
		imageView7.setTranslateX(-400); 
	    imageView7.setTranslateY(330);
	    imageView7.setFitHeight(80); 
	    imageView7.setFitWidth(100);
	    imageView7.setPreserveRatio(true);
	    
	    Image image8 = new Image(new FileInputStream("C:/Users/cluec/Pictures/doublecheese.jpg"));
		ImageView imageView8 = new ImageView(image8);
		imageView8.setTranslateX(-400); 
	    imageView8.setTranslateY(420);
	    imageView8.setFitHeight(80); 
	    imageView8.setFitWidth(100);
	    imageView8.setPreserveRatio(true);
	    
	    Image image9 = new Image(new FileInputStream("C:/Users/cluec/Pictures/tenders.jpg"));
		ImageView imageView9 = new ImageView(image9);
		imageView9.setTranslateX(140); 
	    imageView9.setTranslateY(-210);
	    imageView9.setFitHeight(100); 
	    imageView9.setFitWidth(100);
	    imageView9.setPreserveRatio(true);
	    
	    Image image10 = new Image(new FileInputStream("C:/Users/cluec/Pictures/soda.jpeg"));
		ImageView imageView10 = new ImageView(image10);
		imageView10.setTranslateX(140); 
	    imageView10.setTranslateY(-80);
	    imageView10.setFitHeight(100); 
	    imageView10.setFitWidth(100);
	    imageView10.setPreserveRatio(true);
	    
	    Image image11 = new Image(new FileInputStream("C:/Users/cluec/Pictures/water.jpg"));
		ImageView imageView11 = new ImageView(image11);
		imageView11.setTranslateX(140); 
	    imageView11.setTranslateY(30);
	    imageView11.setFitHeight(100); 
	    imageView11.setFitWidth(100);
	    imageView11.setPreserveRatio(true);
	    
	    Image image12 = new Image(new FileInputStream("C:/Users/cluec/Pictures/lemonade.jpg"));
		ImageView imageView12 = new ImageView(image12);
		imageView12.setTranslateX(140); 
	    imageView12.setTranslateY(140);
	    imageView12.setFitHeight(100); 
	    imageView12.setFitWidth(100);
	    imageView12.setPreserveRatio(true);


		// buttons
		Button loginButton = new Button("Login");
		loginButton.setStyle("-fx-font: 18 arial; ");
		loginButton.setStyle("-fx-base: #fec89a; ");
		loginButton.setPrefHeight(30);
		loginButton.setDefaultButton(true);
		loginButton.setPrefWidth(60);
		loginButton.setTranslateX(-460);
		loginButton.setTranslateY(-320);

		Button cartButton = new Button("Cart");
		cartButton.setStyle("-fx-font: 18 arial; ");
		cartButton.setStyle("-fx-base: #fec89a; ");
		cartButton.setPrefHeight(30);
		cartButton.setDefaultButton(true);
		cartButton.setPrefWidth(60);
		cartButton.setTranslateX(630);
		cartButton.setTranslateY(-440);

		Button addButton = new Button("add to cart");
		addButton.setPrefHeight(30);
		addButton.setDefaultButton(true);
		addButton.setPrefWidth(100);

		// alignment
		gridPane.add(loginButton, 0, 0);
		gridPane.add(cartButton, 0, 3);
		/*gridPane.add(addButton, 0, 0);*/
		
		gridPane.add(search, 0, 0);
		
		gridPane.add(sides, 0, 0); 
	    gridPane.add(entrees, 1, 0); 
	    gridPane.add(beverages, 0, 1);
	    
	    gridPane.add(imageView1, 0, 0);
	    gridPane.add(imageView2, 0, 0);
	    gridPane.add(imageView3, 0, 0);
	    gridPane.add(imageView4, 0, 0);
	    gridPane.add(imageView5, 0, 0);
	    gridPane.add(imageView6, 0, 0);
	    gridPane.add(imageView7, 0, 0);
	    gridPane.add(imageView8, 0, 0);
	    gridPane.add(imageView9, 0, 0);
	    gridPane.add(imageView10, 0, 0);
	    gridPane.add(imageView11, 0, 0);
	    gridPane.add(imageView12, 0, 0);
	    
	    
	    gridPane.add(fries, 0, 0);
	    

	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
