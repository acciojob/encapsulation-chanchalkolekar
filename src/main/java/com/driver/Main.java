package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // obj.name = "chanchal";

        obj.setName("chanchal");
        System.out.println(obj.getName());
    }
}