package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private Injector i = new Injector();
    /**
     * Проверка создания птицы.
     */
    @Test
    public void TestBird()
    {
    	try
    	{
	    	Creature c = new Bird();
	    	i.Inject(c);
	    	c.Live();
	        assertTrue( true );
        } catch (Exception e) {
			 assertTrue(false);
		}
    }
     /**
     * Проверка создания птицы и наделение её функционалом полёта и чирикания.
     */
    @Test
    public void TestBird2()
    {
    	try
    	{
	    	Creature c = new Bird();
	    	i.Inject(c);
	    	String s = c.Live();
	        assertTrue( s.compareTo("fly scree") == 0 );
        } catch (Exception e) {
			 assertTrue(false);
		}
    }
     /**
     * Проверка создания собаки и наделение её функционалом бега и лая.
     */
    @Test
    public void TestDog()
    {
    	try
    	{
	    	Creature c = new Dog();
	    	i.Inject(c);
	    	String s = c.Live();
	        assertTrue( s.compareTo("run bark") == 0 );
        } catch (Exception e) {
			 assertTrue(false);
		}
    }
     /**
     * Проверка создания змеи и наделение её функционалом ползания и штпения.
     */
    @Test
    public void TestSnake()
    {
    	try
    	{
	    	Creature c = new Snake();

	    	i.Inject(c);
	    	String s = c.Live();
	        assertTrue( s.compareTo("crawl hiss") == 0 );
        } catch (Exception e) {
			 assertTrue(false);
		}
    }
}
