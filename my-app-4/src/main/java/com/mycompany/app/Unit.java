package com.mycompany.app;

public class Unit
{
	protected String name;
	protected int id;

	public String getName() {return name;}
	public int getId() {return id;}
	public void setName(String val) {name = val;}
	public void setId(int val) {id = val;}

	public Unit(String name, String id)
	{
		this.name = name;
		try{this.id = Integer.parseInt(id);} catch(Exception e){}
	}

}