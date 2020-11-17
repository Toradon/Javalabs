package com.mycompany.app;

import java.util.ArrayList;

/**
 *  Класс для хранения списка рвботников или подразделений.
 */

public class UnitCollection<T extends Unit> extends ArrayList<T>
{

/**
 * Метод генерации нового идентефикатора.
 *@return Свободный идентификатор.
 */

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

/**
 * Метод поиска объекта по имени или названию.
 *@param name Имя или название.
 *@return Возвращает ссылку на объект, если он найден, или null, если не найден.
 */

	public T getByName(String name)
	{
		for(int i =0; i < size(); i++)
		{
			T u = get(i);
			if(u.getName().compareTo(name) == 0) return u;
		}
		return null;
	}

	public void print()
	{
		for(int i =0; i < size(); i++)
		{
			T u = get(i);
			System.out.println(u);
		}
	}
}