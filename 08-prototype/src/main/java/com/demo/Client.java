package com.demo;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/22  21:56
 *@description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();
        System.out.println("克隆对象与原型对象是不是同一对象：" + (r1 == r2));
    }
}
