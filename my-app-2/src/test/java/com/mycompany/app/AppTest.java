package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testNumber()
    {
    	try
    	{
    	Node n = Node.parse("123");

        assertTrue( n.eval() == 123 );
        }
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }

    @Test
    public void testNotNumber()
    {
    	try
    	{
    		Node n = Node.parse("qqq");
    	
    		n.eval();
    		assertTrue( false );
    	}
    	catch(Exception e)
    	{
    		assertTrue( true );
    	}
    }

    @Test
    public void testPlus()
    {
    	try
    	{
    	Node n = Node.parse("2+3");
    	assertTrue( n.eval() == 5 );
    	}
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }

     @Test
    public void testMinus()
    {	
    	try
    	{
    	Node n = Node.parse("2-3");
    	assertTrue( n.eval() == -1 );
    	}
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }

     @Test
    public void testComb()
    {
    	try
    	{
    	Node n = Node.parse("2*3-6/3");
    	assertTrue( n.eval() == 4 );
    	}
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }

     @Test
    public void testParentheses()
    {
    	try
    	{
    	Node n = Node.parse("(2*3-6)/3");
    	assertTrue( n.eval() == 0 );
    	}
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }
     @Test
    public void testSpaces()
    {
    	try
    	{
    	Node n = Node.parse(" (2 * 3 -6 ) / 3");
    	assertTrue( n.eval() == 0 );
    	}
    	catch(Exception e)
    	{
    		assertTrue( false );
    	}
    }
}
