package project360;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ViewRestAcc extends BorderPane{
	private Insets inset;
	//in the top border
	private Label restNameHeader;
	private Label loginMsg;
	private VBox header;
	private Button backToMenu;
	
	//in the center pane is a gridpane
	private Label editItemLab;
	private TextField searchBox;
	
	//editItemGrid Label nodes
	private Label editSection;
	private Label editName;
	private Label editPrice;
	private Label editIngr;
	private Label photoUploadLab;
	private Button removeButton;
	
	//editItemGrid TextField nodes
	private TextField editSectionText;
	private TextField editNameText;
	private TextField editPriceText;
	private TextField editIngrText;
	private Button editPhoto;
	private Button updateItemButton;
	
	//addItemLabGrid nodes
	private Label addItemLab;
	private Label addSection;
	private Label addName;
	private Label addPrice;
	private Label addIngr;
	private Label newPhotoUploadLab;
	
	//addItemTextGrid nodes
	private TextField addSectionText;
	private TextField addNameText;
	private TextField addPriceText;
	private TextField addIngrText;
	private Button addPhoto;
	private Button addItemBut;
	
	//couponGrid nodes
	private Label addCoupLab;
	private Label coupCodeLab;
	private Label coupAmountLab;
	private TextField coupCodeText;
	private TextField coupAmountText;
	private Button addCoupBut;
	
	//center GridPane nodes
	private GridPane editItemGrid;
	private GridPane addItemGrid;
	private GridPane couponGrid;
	private GridPane centerPane;
	
	//in the bottom border
	private Button saveChangesBut;
	
	public ViewRestAcc() {
		inset = new Insets(25, 25, 25, 25);
		
		restNameHeader = new Label("RESTAURANT NAME HERE");
		loginMsg = new Label("Successfully logged in! Welcome back!");
		header = new VBox(10);
		header.setPadding(inset);
		header.getChildren().addAll(restNameHeader, loginMsg);
		header.setAlignment(Pos.CENTER);
		backToMenu = new Button("Back to Menu");

		
		editItemLab = new Label("Edit Existing Menu Item");
		searchBox = new TextField("search for an item");
		
		//editItemGrid nodes
		editSection = new Label("Section:");
		editName = new Label("Name:");
		editPrice = new Label("Price:");
		editIngr = new Label("Ingredients:");
		photoUploadLab = new Label("Upload Photo:");
		removeButton = new Button("Remove Item");

		editSectionText = new TextField();
		editNameText = new TextField();
		editPriceText = new TextField();
		editIngrText = new TextField();
		editPhoto = new Button("Click here to upload photo");
		updateItemButton = new Button("Update Item");
		
		//add everything to the GridPane in the middle
		editItemGrid = new GridPane();
		editItemGrid.setPadding(inset);
		editItemGrid.add(editItemLab, 0, 0);
		editItemGrid.add(searchBox, 0, 1);
		editItemGrid.add(editSection, 0, 2);
		editItemGrid.add(editSectionText, 1, 2);
		editItemGrid.add(editName, 0, 3);
		editItemGrid.add(editNameText, 1, 3);
		editItemGrid.add(editPrice, 0, 4);
		editItemGrid.add(editPriceText, 1, 4);
		editItemGrid.add(editIngr, 0, 5);
		editItemGrid.add(editIngrText, 1, 5);
		editItemGrid.add(photoUploadLab, 0, 6);
		editItemGrid.add(editPhoto, 1, 6);
		editItemGrid.add(removeButton, 0, 7);
		editItemGrid.add(updateItemButton, 1, 7);
		editItemGrid.setHgap(5);
		editItemGrid.setVgap(5);
		GridPane.setHalignment(updateItemButton, HPos.RIGHT);
		
		//addItemGrid nodes
		addItemLab = new Label("Add New Menu Item");
		addItemLab.setMinWidth(150);
		addSection = new Label("Section:");
		addName = new Label("Name:");
		addPrice = new Label("Price:");
		addIngr = new Label("Ingredients: ");
		newPhotoUploadLab = new Label("Upload Photo");
		
		addSectionText = new TextField();
		addNameText = new TextField();
		addPriceText = new TextField();
		addIngrText = new TextField();
		addPhoto = new Button("Click here to upload photo");
		addItemBut = new Button("Update Menu");
		
		addItemGrid = new GridPane();
		addItemGrid.setPadding(inset);
		addItemGrid.add(addItemLab,  0, 0);
		Label emptyLab = new Label(" ");		 //just using this to have uniform sizing with
		emptyLab.setFont(new Font("Arial", 20)); //the editItemGrid
		addItemGrid.add(emptyLab,  0, 1);
		addItemGrid.add(addSection, 0, 2);
		addItemGrid.add(addSectionText, 1, 2);
		addItemGrid.add(addName, 0, 3);
		addItemGrid.add(addNameText, 1, 3);
		addItemGrid.add(addPrice, 0, 4);
		addItemGrid.add(addPriceText, 1, 4);
		addItemGrid.add(addIngr, 0, 5);
		addItemGrid.add(addIngrText, 1, 5);
		addItemGrid.add(newPhotoUploadLab, 0, 6);
		addItemGrid.add(addPhoto, 1, 6);
		addItemGrid.add(addItemBut, 1, 7);
		addItemGrid.setHgap(5);
		addItemGrid.setVgap(5);
		GridPane.setHalignment(addItemBut, HPos.RIGHT);
		
		//couponGrid nodes
		addCoupLab = new Label("Add Coupon Promotion");
		addCoupLab.setMinWidth(150);
		coupCodeLab = new Label("Code:");
		coupAmountLab = new Label("Discount Amount:");
		coupCodeText = new TextField();
		coupAmountText = new TextField();
		addCoupBut = new Button("Enable Coupon Promotion");
		couponGrid = new GridPane();
		couponGrid.setPadding(inset);
		couponGrid.add(addCoupLab, 0, 0);
		couponGrid.add(coupCodeLab, 0, 1);
		couponGrid.add(coupCodeText, 1, 1);
		couponGrid.add(coupAmountLab, 0, 2);
		couponGrid.add(coupAmountText, 1, 2);
		couponGrid.add(addCoupBut, 1, 3);
		couponGrid.setHgap(5);
		couponGrid.setVgap(5);
		GridPane.setHalignment(addCoupBut, HPos.RIGHT);
		
		//centerPane grid nodes
		centerPane = new GridPane();
		centerPane.add(backToMenu, 0, 0);
		centerPane.add(editItemGrid, 0, 1);
		centerPane.add(addItemGrid, 1, 1);
		centerPane.add(couponGrid, 0, 2);
		GridPane.setHalignment(editItemGrid, HPos.CENTER);
		GridPane.setHalignment(addItemGrid, HPos.CENTER);
		GridPane.setHalignment(couponGrid, HPos.CENTER);

		
		//in the bottom border
		saveChangesBut = new Button("Save Changes");
		BorderPane.setAlignment(saveChangesBut, Pos.CENTER_RIGHT);
		
		//set this.top to header
		this.setPadding(inset);
		this.setTop(header);
		this.setCenter(centerPane);
		this.setBottom(saveChangesBut);
		
		//handlers
		ButtonHandler handle = new ButtonHandler();
		backToMenu.setOnAction(handle);
		removeButton.setOnAction(handle);
		editPhoto.setOnAction(handle);
		updateItemButton.setOnAction(handle);
		addPhoto.setOnAction(handle);
		addItemBut.setOnAction(handle);
		addCoupBut.setOnAction(handle);
		saveChangesBut.setOnAction(handle);		
		
	}
	
	private class ButtonHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			if(event.getSource() == backToMenu) {
				//this is just to show the button works
				backToMenu.setText("you clicked me");
				
				//TODO: link to change scene
			}
			if(event.getSource() == removeButton) {
				//this is just to show the button works
				removeButton.setText("you clicked me");
				
				//TODO: find the MenuItem based on name, delete from the LinkedList
			}
			if(event.getSource() == editPhoto) {
				//this is just to show the button works
				editPhoto.setText("you clicked me");
				
				//TODO: figure out how to upload a photo
			}
			if(event.getSource() == updateItemButton) {
				//this is just to show the button works
				updateItemButton.setText("you clicked me");
				
				//TODO: find MenuItem based on name, set all attributes based on TextFields
			}
			if(event.getSource() == addPhoto) {
				//this is just to show the button works
				addPhoto.setText("you clicked me");
				
				//TODO: upload photo and replace the MenuItem's photo
			}
			if(event.getSource() == addItemBut) {
				//this is just to show the button works
				addItemBut.setText("you clicked me");
				
				//TODO: create a new menuItem using all info in TextFields
			}
			if(event.getSource() == addCoupBut) {
				//this is just to show the button works
				addCoupBut.setText("you clicked me");
				
				//TODO: create a coupon using all info in TextFields
			}
			if(event.getSource() == saveChangesBut) {
				//this is just to show the button works
				saveChangesBut.setText("you clicked me");
				
				//TODO: is the button going to do the same as the other ones? is it necessary? does it go back to menu?
			}
		}
	}
	
	

}
