package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Проверяем создание контейнера
     */
    @Test
    public void newTest()
    {
    	Container c = new Container();
        assertTrue( c.getSize() == 0 );
    }

	/**
     * Проверяем изменение размера
     */
	@Test
    public void resizeTest()
    {
    	Container c = new Container();
    	c.resize(3);
        assertTrue( c.getSize() == 3 );
    }

    /**
     * Проверяем добавление элемента
     */
    @Test
    public void addTest()
    {
		try
		{
			Container c = new Container();
			c.add(3);
			assertTrue( c.getSize() == 1 );
			assertTrue( c.get(0) == 3 );
		} catch (ContainerException e) {
			 assertTrue(false);
		}
    }
    /**
     * Проверяем удаление элемента
     */
    @Test
    public void removeTest()
    {
		try
		{
			Container c = new Container();
			c.add(1);
			c.add(2);
			c.add(3);
			c.remove(1);
			assertTrue( c.getSize() == 2 );
			assertTrue( c.get(1) == 3 );
		} catch (ContainerException e) {
			 assertTrue(false);
		}
    }
}