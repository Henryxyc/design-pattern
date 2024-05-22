package com.test;

import java.io.*;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/22  22:00
 *@description: 原型模式 浅克隆（cloneable 拷贝对象与原型对象共用一个内部对象） 深克隆（对象流 完完全全拷贝对象 包括内部对象）
 * 使用场景：对象创建非常复杂，可以使用原型模式快捷的创建对象
 *         性能和安全要求比较高
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Citation c1 = new Citation();


//        c1.setName("张三");
//        c2.setName("李四");

        Student student = new Student();
        student.setName("张三");
        c1.setStudent(student);

        //浅克隆
        Citation c2 = c1.clone();
        Student student1 = c2.getStudent();
        student1.setName("李四");

        //深克隆
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/Henry/code/design-pattern/08-prototype/src/main/resources/a.txt"));
        //将对象写到文件中
        oos.writeObject(c1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/Henry/code/design-pattern/08-prototype/src/main/resources/a.txt"));
        //从文件中读取对象
        Citation citation = (Citation) ois.readObject();
        ois.close();

        citation.getStudent().setName("王五");

        c1.show();
        c2.show();
        citation.show();
    }
}
