package com.test;

import java.io.Serializable;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/22  21:59
 *@description: 三好学生
 */
public class Citation implements Cloneable, Serializable {

    //浅克隆
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println("获得三好学生的学生姓名是：" + student.getName());
    }
}
