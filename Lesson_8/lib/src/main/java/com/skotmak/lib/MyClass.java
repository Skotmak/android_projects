package com.skotmak.lib;

import java.lang.ref.SoftReference;

public class MyClass {
    private String name;
    private String age;

    MyClass(String name, String age){
        this.name = name;
        this.age = age;
    }
    public void info(){


        //name = "Fabian"
        System.out.println("Name: " + name + "Age: " + age);    }



}