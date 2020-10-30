package com.mycompany.app;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

/**
* Класс сравнения массивов ArrayList и LinkedList
*/
public class App 
{
	/**
 	* Генератор случайных чисел
 	*/
	public static Random rand = new Random();
	/**
 	* Количество повторений теста
 	*/
	public static final int iter = 10000;

    public static void main( String[] args )
    {

       	ArrayList	al = new ArrayList();


       	Instant i1 = Instant.now();

        for (int i = 0; i < iter; i++)
        {
        	al.add(rand.nextInt());
        }

        Instant i2 = Instant.now();
        Duration d21 = Duration.between(i1, i2);

       


        for (int i = 0; i < iter; i++)
        {
        	Object q = al.get(rand.nextInt(iter));
        }

        Instant i3 = Instant.now();
        Duration d32 = Duration.between(i2, i3);

        int count = iter;

         for (int i = 0; i < iter; i++)
        {
        	al.remove(rand.nextInt(count));
        	count --;
        }

        Instant i4 = Instant.now();
        Duration d43 = Duration.between(i3, i4);

        	LinkedList	ll = new LinkedList();


       	Instant i5 = Instant.now();

        for (int i = 0; i < iter; i++)
        {
        	ll.add(rand.nextInt());
        }

        Instant i6 = Instant.now();
        Duration d65 = Duration.between(i5, i6);

       


        for (int i = 0; i < iter; i++)
        {
        	Object q = ll.get(rand.nextInt(iter));
        }

        Instant i7 = Instant.now();
        Duration d76 = Duration.between(i6, i7);

        int count2 = iter;

         for (int i = 0; i < iter; i++)
        {
        	ll.remove(rand.nextInt(count2));
        	count2 --;
        }

        Instant i8 = Instant.now();
        Duration d87 = Duration.between(i7, i8);

     	System.out.println("ArrayList.add executed " + iter + " times in " + d21.getSeconds() + " seconds " + d21.getNano() + " nanoseconds");
        System.out.println("ArrayList.get executed " + iter + " times in " + d32.getSeconds() + " seconds " + d32.getNano() + " nanoseconds");
        System.out.println("ArrayList.remove executed " + iter + " times in " + d43.getSeconds() + " seconds " + d43.getNano() + " nanoseconds");

        System.out.println("LinkedList.add executed " + iter + " times in " + d65.getSeconds() + " seconds " + d65.getNano() + " nanoseconds");
        System.out.println("LinkedList.get executed " + iter + " times in " + d76.getSeconds() + " seconds " + d76.getNano() + " nanoseconds");
        System.out.println("LinkedList.remove executed " + iter + " times in " + d87.getSeconds() + " seconds " + d87.getNano() + " nanoseconds");
    }
}
