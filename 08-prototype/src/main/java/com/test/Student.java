package com.test;

import java.io.Serializable;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/22  22:09
 *@description:
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
