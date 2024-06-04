package com.demo2;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  22:54
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙888")
                .memory("16G")
                .battery("5000mAh")
                .screen("6.7英寸")
                .build();
        System.out.println(phone);
    }
}
