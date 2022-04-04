package application;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<MenuItem> menuList = new ArrayList<MenuItem>(100);
	
	public void addItem(MenuItem item)
	{
		menuList.add(item);
	}
	
	public boolean removeItem(MenuItem item)
	{
		int temp = searchFor(item);
		
		if(temp != 100000000)
		{
			menuList.remove(temp);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean updateItem(String name, double price, String ingredients, String type) {
		int temp;
		MenuItem tempitem = new MenuItem();
		tempitem.setName(name);
		tempitem.setPrice(price);
		tempitem.setIngredients(ingredients);
		tempitem.setType(type);
		temp = searchFor(tempitem);
		
		if(temp != 100000000)
		{
			menuList.get(temp).setPrice(price);
			menuList.get(temp).setIngredients(ingredients);
			menuList.get(temp).setType(type);
			return true;
		}else {
			return false;
		}
	}
	
	public int numOfItems()
	{
		return menuList.size();
	}
	
	public int searchFor(MenuItem item)
	{
		for(int i = 0; i < menuList.size(); i++)
		{
			if(item.getName().equals(menuList.get(i).getName()))
			{
					return i;
			}
		}
		
		return 100000000;
	}

}
