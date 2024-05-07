package type3;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  22:12
 *@description:
 */

/**
 * 懒汉式（线程不安全）
 * 优点：起到了Lazy Loading的效果，但是只能在单线程下使用
 * 缺点：如果是多线程下，一个线程进入了if语句判断，还没有来得及往下执行，另一个线程也进入了这个if，就会产生多个实例
 *      所以在多线程环境下不可使用这种方式
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
