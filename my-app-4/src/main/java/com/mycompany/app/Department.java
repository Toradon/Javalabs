package com.mycompany.app;

public class Department extends Unit
{
	@Override
	public String toString()
	{
		return "" + id + ":" + name;
	}

	public Department(String name, String id)
	{
		super(name, id);
	}

}