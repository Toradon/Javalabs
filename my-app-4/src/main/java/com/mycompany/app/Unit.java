package com.mycompany.app;

/**
 * Базовый класс для подразделений и работников.
 */

public class Unit
{
	protected String name;
	protected int id;

	public String getName() {return name;}
	public int getId() {return id;}
	public void setName(String val) {name = val;}
	public void setId(int val) {id = val;}

/**
 * Конструктор класса Unit
 *@param name Имя человека или название подразделения
 *@param id Идентификатор в строковом виде для совместимости с парсингом его из CSV-файла
 */

	public Unit(String name, String id)
	{
		this.name = name;
		try{this.id = Integer.parseInt(id);} catch(Exception e){}
	}

}