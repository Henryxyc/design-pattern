

import type6.Singleton;

import java.io.*;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  23:10
 *@description: 测试序列化破坏单例模式
 */
public class Client2 {

    //破坏单例模式的两种方法（枚举除外）：序列化/反射
    public static void main(String[] args) throws Exception {
        writeObject2File();
        readObject2File();
        readObject2File();
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/Henry/code/design-pattern/singleton/file.txt"));
        oos.writeObject(instance);
        oos.close();
    }


    //从文件中读数据（对象）
    public static void readObject2File() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/Henry/code/design-pattern/singleton/file.txt"));
        //读取对象
        Singleton instance = (Singleton)ois.readObject();
        System.out.println(instance);
        ois.close();
    }

}
