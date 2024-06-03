package com.demo1;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/3  22:14
 *@description: 产品对象
 */
public class Bike {
    private String frame; // 车架

    private String seat; // 车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
