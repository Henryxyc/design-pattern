package type4;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  22:12
 *@description:
 */

import java.io.Serializable;

/**
 * 懒汉式（线程安全）synchronized关键字
 * 优点：起到了Lazy Loading的效果，解决了线程安全问题
 * 缺点：效率太低了，每次获取类的实例时，执行getInstance()方法都要执行同步，其实只要一次实例化就够了，
 *      后面想获得实例直接return就行了，同步效率太低。
 */
public class Singleton implements Serializable {
    private Singleton() {
    }

    private static Singleton instance;

    //提供一个静态的公有方法，加入了同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
