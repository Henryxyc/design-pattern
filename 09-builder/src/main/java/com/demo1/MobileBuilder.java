package com.demo1;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/3  22:32
 *@description:
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
