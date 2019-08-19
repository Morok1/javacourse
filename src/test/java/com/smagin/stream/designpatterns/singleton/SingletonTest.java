package com.smagin.stream.designpatterns.singleton;


import org.junit.Before;

public class SingletonTest {
    private Singleton singleton;
    @Before
    public void setUp(){
    }

    @org.junit.Test
    public void getSingleton() {
        singleton = Singleton.getSingleton();
        singleton.printText();
    }

    @org.junit.Test
    public void printText() {

    }
}