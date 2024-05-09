import type6.Singleton;

import java.lang.reflect.Constructor;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  23:10
 *@description: 测试反射破坏单例模式
 */
public class Client3 {

    //破坏单例模式的两种方法（枚举除外）：序列化/反射
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<Singleton> clazz = Singleton.class;
        //获取无参构造方法
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        //取消访问检查
        cons.setAccessible(true);
        //创建Singleton对象
        Singleton s1 = cons.newInstance();
        Singleton s2 = cons.newInstance();
        System.out.println(s1 == s2); //如果返回的是true，说明没有破坏单例模式，如果是false，说明破坏单例模式

    }

}
