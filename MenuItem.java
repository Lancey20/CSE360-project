package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 

public class MenuItem{
private String name;
private double price;
private String ingredients;
private String type;
private Image pic; 

	public void createMenuItem(String newName, double newPrice, String newIngredients, String newType, Image image){ 
		name = newName;
		price = newPrice;
		ingredients = newIngredients;
		type = newType;
		pic = image; 
	} 
	
	public void setName(String updateName){
	    name = updateName;
	}
	
	public void setPrice(double updatePrice)
	{
		price = updatePrice;
	}
	
	public void setIngredients(String updateIngredients)
	{
		ingredients = updateIngredients;
	}
	
	public void setType(String updateType)
	{
		type = updateType;
	}
	
	public void setImage(Image image)
	{
		pic = image; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getIngredients()
	{
		return ingredients;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Image getImage()
	{
		return pic; 
	}
}