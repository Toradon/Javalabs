package com.mycompany.app;

/**
 *  Класс для подразделений.
 */

public class Department extends Unit
{
	@Override
	public String toString()
	{
		return "" + id + ":" + name;
	}


/**
 * Конструктор класса Unit
 *@param name Название подразделения
 *@param id Идентификатор в строковом виде.
 */
	public Department(String name, String id)
	{
		super(name, id);
	}

}