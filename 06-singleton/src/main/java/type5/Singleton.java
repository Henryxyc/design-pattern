package type5;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  22:12
 *@description:
 */

/**
 * 懒汉式（双重检查锁）
 * 优点：解决了单例、性能、线程安全的问题
 * 缺点：在多线程环境下可能会出现空指针问题，问题原因是JVM在实例化对象时候会进行优化和指令的重排序
 * 要解决双重检查锁带来的空指针问题，只需要使用volatile关键字，volatile可以保证变量的可见性和防止指令的重排序
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;
//    private static volatile Singleton instance;

    //提供一个静态的公有方法，加入了同步处理的代码，解决线程安全问题
    //即懒汉式
    public static Singleton getInstance() {
        //第一次判断，如果instance不为null。不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}


