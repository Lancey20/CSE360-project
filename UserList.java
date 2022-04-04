package application;

import java.util.ArrayList;

public class UserList {

	ArrayList<User> userList = new ArrayList<User>(100);
	
	public void addUser(User user)
	{
		userList.add(user);
	}
	
	public void removeUser(User user)
	{
		userList.remove(user);
	}
	
	public boolean searchFor(User user)
	{
		for(int i = 0; i < userList.size(); i++)
		{
			if(user.getName().equals(userList.get(i).getName()))
			{
				if(user.getPassword().equals(userList.get(i).getPassword()))
				{
					return true;
				}
			}
		}
		return false;
	}

	public boolean isRestaurant(User user)
	{
		for(int i = 0; i < userList.size(); i++)
		{
			if(user.getName().equals("Manager"))
			{
				if(user.getPassword().equals("1234"))
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
}
