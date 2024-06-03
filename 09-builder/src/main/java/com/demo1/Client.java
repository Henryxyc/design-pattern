package com.demo1;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/3  22:44
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
