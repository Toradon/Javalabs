package com.mycompany.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stuff extends Unit
{
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
	public String getSexAsString() {return (sex==Sex.male)?"Male":"female";}
	public int getSalary() {return salary;}
	public Date getDate() {return dob;}
	public Department getDepartment() {return department;}
	public String getDepartmentAsString() {return department==null?"":department.toString();}
	public void setSex(Sex val) {sex = val;}
	public void setSalary(int val) {salary = val;}
	public void setDob(Date val) {dob = val;}
	public void setDepartment(Department val) {department = val;}

	public void parseSex(String val) 
	{
		switch(val)
		{
			case "Male": setSex(Sex.male); break;
			case "Female": setSex(Sex.female); break;
		}
	}

	public void parseSalary(String val) 
	{
		setSalary(Integer.parseInt(val));
	}
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