package com.demo1;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/3  22:34
 *@description: 指挥者
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
