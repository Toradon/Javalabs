package com.mycompany.app;
/**
* Класс аннотации для внедрения функционала в произвольные классы
*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AutoInjectable{}