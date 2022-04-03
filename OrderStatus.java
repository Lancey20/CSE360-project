package project360;

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
import java.util.*; 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class OrderStatus {
	//uncomment all arraylist once menu item is in place
	
	//private ArrayList<menuList> itemsList = new ArrayList<>();
	private int waitTime;
	private int placeInLine;
	
	
	public OrderStatus() {
		//itemsList = {"Pizza"}
		waitTime = 0;
		placeInLine = 0;
	}
	
	/*
	 public menuList getItemsList(){
	 	return itemsList();
	 }
	 */
	
	public int getWaitTime() {
		return waitTime;
	}
	
	public int getPlaceInLine() {
		return placeInLine;
	}
	
	/*
	 public void setItemsList(menuItem itemsList){
	 	this.itemsList = itemsList;
	 }
	 */
	
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	
	public void setPlaceInLine(int placeInLine) {
		this.placeInLine = placeInLine;
	}
	
	
	public int waitTime() {
		return waitTime;
	}
	public int placeInLine() {
		return placeInLine;
	}
}
