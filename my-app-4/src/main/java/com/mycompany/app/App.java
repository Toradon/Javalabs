package com.mycompany.app;

import java.io.InputStream;
import java.io.InputStreamReader;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
/**
 * Класс чтения CSV-файла заданной структуры. Данные читаются из файла ресурсов /foreign_names.csv.
 *
 */
public class App 
{
	private static UnitCollection departments = new UnitCollection();
	private static UnitCollection stuff = new UnitCollection();
    public static void main( String[] args )
    {
        System.out.println( "Reading CSV file" );

        String fileName = "/foreign_names.csv";

        Character separator = ';';

        try (InputStream in = App.class.getResourceAsStream(fileName);
                CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null) {
                throw new FileNotFoundException(fileName);
            }
            String[] nextLine = reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
            	Stuff s = new Stuff(nextLine[1], nextLine[0]);
            	s.parseSex(nextLine[2]);
            	s.parseDob(nextLine[3]);
            	s.parseSalary(nextLine[5]);

            	Unit dep = departments.getByName(nextLine[4]);
            	if (dep == null) 
            	{
            		dep = new Department(nextLine[4], departments.generateId());
            		departments.add(dep);
            	}
            	s.setDepartment((Department)dep);
            	stuff.add(s);
            }

            stuff.print();
        } catch(Exception e){
			System.out.println( e.toString());
		}

    }   
}
