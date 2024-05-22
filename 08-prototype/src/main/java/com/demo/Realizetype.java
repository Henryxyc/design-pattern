package com.demo;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/22  21:54
 *@description:
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型类的构造方法执行了....");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("执行了克隆...");
        return (Realizetype) super.clone();
    }
}
