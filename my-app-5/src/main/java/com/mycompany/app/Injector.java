package com.mycompany.app;

import java.lang.reflect.*;
import java.util.Properties;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
* Класс, обеспечивающий внедрение нового функционала в произвольные классы с использованием полей, аннотированных AutoInjectable. 
* Связь классов и их нового функционала описана в файле Injections.txt
*/
public class Injector{

    private Properties injections = new Properties();

    public Injector(){
        String fileName = "/Injections.txt";

        try (InputStream in = App.class.getResourceAsStream(fileName)) {

            injections.load(new InputStreamReader(in));

        }
        catch (Exception e){}
    }
/**
* Метод внедрения функционала.
*@param c - используемый объект.
*/
    public <T> void Inject(T c) throws Exception {
        Field[] fields = c.getClass().getFields();

        for (Field f : fields) {
            if (f.isAnnotationPresent(AutoInjectable.class)) {
                String className = injections.getProperty(c.getClass().getName() + "." + f.getName());
                   Class<?> clazz = Class.forName(className);
                    Constructor<?> ctor = clazz.getConstructor();
                    Object object = ctor.newInstance();
                    f.set(c, object);
            }
        }
    }
}