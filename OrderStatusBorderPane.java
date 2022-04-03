package project360;

//the number of orders and wait time is currently hard coded in

import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class OrderStatusBorderPane extends BorderPane{
	private HBox orderStatusLabels;
	private Button orderStatusAccount;
	private Button orderStatusResturantName;
	private Button orderStatusBack;
	
	private VBox orderStatusConformation;
	private Button orderStatusCancel;
	
	/* the following below are hard coded in and need to be dehardcoded for the final prototype
	 * it is currently a work in progress
	 */
	private Label orderStatusOrders;
	private Label orderStatusWait;
	private Label orderStatusReady;
	
	
	public OrderStatusBorderPane() {
		orderStatusAccount = new Button("Account");
		//orderStatusAccount.maxWidth(MAX_VALUE);
		orderStatusAccount.setStyle("-fx-background-color: #DEB887");
		orderStatusAccount.setMinWidth(60);
		//change the name when you know what the name is
		orderStatusResturantName = new Button("RESTURAUNT NAME HERE");
		orderStatusResturantName.setStyle("-fx-background-color: #90EE90");
		orderStatusBack = new Button("Back");
		orderStatusBack.setStyle("-fx-background-color: #DEB887");
		orderStatusLabels = new HBox();
		orderStatusLabels.setPadding(new Insets(12, 12, 12, 12));
		orderStatusLabels.setSpacing(108);
		orderStatusLabels.getChildren().addAll(orderStatusAccount, orderStatusResturantName,
				orderStatusBack);
		
		orderStatusConformation = new VBox();
		//This is the hardcode section
		orderStatusOrders = new Label("There are " + " orders in front of you.");
		orderStatusOrders.setFont(Font.font("Verdana", 20));
		orderStatusWait = new Label("Approximate wait time: 15 minutes");
		orderStatusWait.setFont(Font.font("Verdana", 15));
		orderStatusReady = new Label("Your order is now ready");
		orderStatusReady.setFont(Font.font("Verdana", 15));
		orderStatusReady.setStyle("-fx-font-weight: bold");
		orderStatusCancel = new Button("Cancel");
		orderStatusCancel.setStyle("-fx-background-color: #DC143C");
		orderStatusCancel.setPadding(new Insets(12,12,12,12));
		orderStatusConformation.setSpacing(20);
		orderStatusConformation.setAlignment(Pos.CENTER);
		//end of hardcode section
		orderStatusConformation.getChildren().addAll(orderStatusOrders, orderStatusWait, 
				orderStatusReady, orderStatusCancel);
		
		this.setTop(orderStatusLabels);
		this.setCenter(orderStatusConformation);
        
		orderStatusAccount.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				orderStatusAccount.setText("Clicked");
			}
		});
		
		orderStatusResturantName.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				orderStatusResturantName.setText("Clicked");
			}
		});
		
		orderStatusBack.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				orderStatusBack.setText("Clicked");
			}
		});
		
		orderStatusCancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				orderStatusCancel.setText("Clicked");
			}
		});
		
		//Scene scene = new Scene(OrderStatusBorderPane);
        //primaryStage.setScene(scene);
        //primaryStage.show();
	}
}
