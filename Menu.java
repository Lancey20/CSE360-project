package application;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<MenuItem> menuList = new ArrayList<MenuItem>(100);
	
	public Menu()
	{
		//sides**************************************
		MenuItem fries = new MenuItem();
		fries.setName("Fries");
		fries.setPrice(5.00);
		fries.setIngredients("Ingredients: Potatoes, Salt, Vegetable Oil");
		fries.setType("Side");
		
		MenuItem macnCheese = new MenuItem();
		macnCheese.setName("Mac-n-Cheese");
		macnCheese.setPrice(5.00);
		macnCheese.setIngredients("Ingredients: Pasta, Butter, Flour, Milk,\r\n"
				+ "Sharp Cheddar, Salt, Black Pepper, Paprika");
		macnCheese.setType("Side");
		
		MenuItem cheeseCurds = new MenuItem();
		cheeseCurds.setName("Cheese Curds");
		cheeseCurds.setPrice(5.00);
		cheeseCurds.setIngredients("Ingredients: Cheese Curds, Buttermilk,\r\n"
				+ "Baking Soda, Flour, Garlic Salt, Eggs, Vegetable Oil");
		cheeseCurds.setType("Side");
		
		
		//meals**************************************
		MenuItem cheeseburger = new MenuItem();
		cheeseburger.setName("Cheeseburger");
		cheeseburger.setPrice(5.00);
		cheeseburger.setIngredients("Ingredients: Beef patty topped with cheddar \r\n"
				+ "cheese, lettuce, tomato, onion, \r\n"
				+ "mayonnaise on top of a sesame bun ");
		cheeseburger.setType("Entrees");
		
		MenuItem baconCheeseburger = new MenuItem();
		baconCheeseburger.setName("Bacon Cheeseburger");
		baconCheeseburger.setPrice(5.00);
		baconCheeseburger.setIngredients("Ingredients: Beef patty topped with cheddar \r\n"
				+ "cheese, lettuce, tomato, onion, bacon \r\n"
				+ "mayonnaise on top of a sesame bun");
		baconCheeseburger.setType("Entrees");
		
		MenuItem chickenSandwich = new MenuItem();
		chickenSandwich.setName("Chicken Sandwich");
		chickenSandwich.setPrice(5.00);
		chickenSandwich.setIngredients("Ingredients: Crispy chicken topped with\r\n"
				+ "cheddar cheese, lettuce, tomato, onion,\r\n"
				+ "mayonnaise on top of a sesame bun");
		chickenSandwich.setType("Entrees");
		
		MenuItem impossibleBurger = new MenuItem();
		impossibleBurger.setName("Chicken Sandwich");
		impossibleBurger.setPrice(5.00);
		impossibleBurger.setIngredients("Ingredients: Impossible burger topped with\r\n"
				+ " cheddar cheese, lettuce, tomato, onion, \r\n"
				+ "mayonnaise on top of a sesame bun");
		impossibleBurger.setType("Entrees");
		
		MenuItem doubleCheeseburger = new MenuItem();
		doubleCheeseburger.setName("Double Cheeseburger");
		doubleCheeseburger.setPrice(5.00);
		doubleCheeseburger.setIngredients("Ingredients: Double burger topped with cheddar\r\n"
				+ "cheese with lettuce, onions, mayonnaise on top\r\n"
				+ "of a sesame bun");
		doubleCheeseburger.setType("Entrees");
		
		MenuItem chickenStrips = new MenuItem();
		chickenStrips.setName("Chicken Strips");
		chickenStrips.setPrice(5.00);
		chickenStrips.setIngredients("Ingredients: Breaded chicken breast\r\n"
				+ "seasoned with garlic salt, dried basil,\r\n"
				+ "paprika, and pepper. Served with\r\n"
				+ "Ketchup and Mustard");
		chickenStrips.setType("Entrees");
		
		//drinks**************************************
		MenuItem soda = new MenuItem();
		soda.setName("Soda");
		soda.setPrice(1.00);
		soda.setIngredients("Available options: Sprite, Coke, Pepsi, Dr. Pepper, \r\n"
				+ "Mountain Dew, Canada Dry\r\n"
				+ "(Decide upon pickup)");
		soda.setType("Drinks");
		
		MenuItem water = new MenuItem();
		water.setName("Water");
		water.setPrice(1.00);
		water.setIngredients("Ingredients: Purified Water, Magnesium Sulfate, \r\n"
				+ "Potassium Chloride, Salt");
		water.setType("Drinks");
		
		MenuItem lemonade = new MenuItem();
		lemonade.setName("Lemonade");
		lemonade.setPrice(1.00);
		lemonade.setIngredients("Ingredients: Water, High Fructose Corn Syrup,\r\n"
				+ "Citric Acid, Sodium Benzoate, Lemon Juice");
		lemonade.setType("Drinks");
		
		
		menuList.add(fries);
		menuList.add(macnCheese);
		menuList.add(cheeseCurds);
		menuList.add(cheeseburger);
		menuList.add(baconCheeseburger);
		menuList.add(chickenSandwich);
		menuList.add(impossibleBurger);
		menuList.add(doubleCheeseburger);
		menuList.add(chickenStrips);
		menuList.add(soda);
		menuList.add(water);
		menuList.add(lemonade);
		
	}
	
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
	
		public MenuItem getAtIndex(int index)
	{
		return menuList.get(index);
	}

}

