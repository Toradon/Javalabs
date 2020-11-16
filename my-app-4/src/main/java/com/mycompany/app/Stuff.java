package com.mycompany.app;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Класс для работников.
 */

public class Stuff extends Unit
{
	/**
 	*  Перечисление для пола.
 	*/
	public enum Sex
	{
		male, female
	}

	private Sex sex;
	private Department department = null;
	private int salary;
	private Date dob;
	private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

	public Sex getSex() {return sex;}
	private String getSexAsString() {return (sex==Sex.male)?"Male":"female";}
	public int getSalary() {return salary;}
	public Date getDate() {return dob;}
	public Department getDepartment() {return department;}
	private String getDepartmentAsString() {return department==null?"":department.toString();}
	public void setSex(Sex val) {sex = val;}
	public void setSalary(int val) {salary = val;}
	public void setDob(Date val) {dob = val;}
	public void setDepartment(Department val) {department = val;}

/**
 * Метод задания пола работника в виде строки.
 *@param val Пол в виде строки male|female.
 */
	public void parseSex(String val) 
	{
		switch(val)
		{
			case "Male": setSex(Sex.male); break;
			case "Female": setSex(Sex.female); break;
		}
	}

/**
 * Метод задания зарплаты работника в виде строки.
 *@param val Зарплата в виде строки. 
 */

	public void parseSalary(String val) 
	{
		setSalary(Integer.parseInt(val));
	}

/**
 * Метод задания даты рождения работника в виде строки.
 *@param val Дата рождения в виде строки.
 */

	public void parseDob(String val) 
	{
		try{setDob(format.parse(val));}
		catch(Exception e){}
	}

	public Stuff(String name, String id)
	{
		super(name, id);
	}

	@Override
    public String toString()
    {
        return "" + id + ";" + name + ";" + getSexAsString() + ";" + format.format(dob) + ";" + getDepartmentAsString() + ";" + salary;
    }

}