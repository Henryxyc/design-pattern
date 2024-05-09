package type6;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  22:12
 *@description:
 */

import java.io.Serializable;

/**
 * 懒汉式（静态内部类方式）
 * 原因是，JVM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法被调用时才会被加载，并初始化其静态属性
 * 静态属性由于被static修饰，保证只被实例化一次，并且严格保证实例化顺序
 * 优点：静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式，在没有加任何锁的情况下，
 *      保证了多线程下的安全，并且没有任何性能影响和空间的浪费
 * 缺点：
 */
public class Singleton implements Serializable {
    private static boolean flag = false;

    //私有构造方法
    private Singleton() {
        //防止多线程环境下出现线程安全问题
        synchronized (Singleton.class) {
            //判断flag的值是否是true，如果是true，说明是非第一次访问，如果是false，说明是第一次访问
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag设置为true
            flag = true;
        }
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton instance = new Singleton();
    };

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.instance;
    }
}


