package application;
import java.util.ArrayList;

public class Cart {
	
	private ArrayList<MenuItem> itemsInCart;

private ArrayList<MenuItem> cartList()	//all instances of menuItem are a dummy class
//I created as a placeholder until I can use the actual menuItem
{
	
	
	return itemsInCart; //in progress there might be a better way to do this
}

public boolean addItem(MenuItem item)
{
	itemsInCart.add(item);
	
	return true;
}

public boolean removeItem(MenuItem item)
{
	for(int i = 0; i < itemsInCart.size(); i++)
	{
		if(itemsInCart.get(i) == item)//I know this isn't right, I will update when I have code for MenuItem
		{
			itemsInCart.remove(i);
			return true;
		}
	}
	
	return false;
}

public double showTotal()
{
	MenuItem temp;
	double total = 0;
	
	for(int j = 0; j < itemsInCart.size(); j++) //need menuItem class
	{
		temp = itemsInCart.get(j);
		total = total + temp.getPrice();
	}
	return total;
}

public void checkout()
{
	//I'm not sure what this is used for
	
}

public int numbercartItems()
{
	int totalitems = itemsInCart.size();
	
	return totalitems;
}

}