package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	private static UnitCollection departments = new UnitCollection();

    /**
     * Проверяем генерацию id.
     */
    @Test
    public void generateIdTest()
    {
    	departments.add(new Department("qqq", departments.generateId()));
		departments.add(new Department("zzz", departments.generateId()));
		
        assertTrue( departments.get(0).getId() == 0);
        assertTrue( departments.get(1).getId() == 1);
    }

    /**
     * Проверяем поиск по имени.
     */
    @Test
    public void nameTest()
    {
    	departments.add(new Department("qqq", departments.generateId()));
		departments.add(new Department("zzz", departments.generateId()));
		
        assertTrue( departments.getByName("qqq").getName().compareTo("qqq") == 0);
    }
}
