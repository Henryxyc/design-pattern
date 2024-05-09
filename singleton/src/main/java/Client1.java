import type7.Singleton;

import java.io.*;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  23:10
 *@description:
 */
public class Client1 {
    public static void main(String[] args) {
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
