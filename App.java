package project360;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;


public class App extends Application
{
	@Override
    public void start(Stage primaryStage) 
	{
    	Stage window;
    	Scene scene1, scene2;
    	
        //create a CirclePane object.
        OrderStatusBorderPane gui = new OrderStatusBorderPane();

        //put gui on top of the rootPane
        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(gui);
        
        // Create a scene and place rootPane in the stage
        Scene scene = new Scene(rootPane, 500, 500);
        primaryStage.setTitle("Restaurant Name");
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        
    	
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}