package com.mycompany.app;

import java.util.ArrayList;

public class UnitCollection extends ArrayList<Unit>
{
	public String generateId()
	{
		Integer id = size();
		boolean busy = false;
		do
		{
			busy = false;
			for(int i =0; i < size(); i++)
			{
				Unit u = get(i);
				if(u.getId() == id) 
					{
						busy = true;
						break;
					}

			}
			if(busy) id++;
		} while (busy);
		return id.toString();
	}

	public Unit getByName(String name)
	{
		for(int i =0; i < size(); i++)
		{
			Unit u = get(i);
			if(u.getName().compareTo(name) == 0) return u;
		}
		return null;
	}

	public void print()
	{
		for(int i =0; i < size(); i++)
		{
			Unit u = get(i);
			System.out.println(u);
		}
	}
}