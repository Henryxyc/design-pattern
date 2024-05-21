package type2;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  22:12
 *@description:
 */
/**
 * 饿汉式（静态代码块）和静态变量的方式基本类似，只不过把实例化的过程放到了静态代码块当中，优缺点也是一样的
 * 优点：写法简单，就是在类加载的时候就完成了实例化，避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy loading的效果，如果从始至终没有使用过这个实例，就会造成内存浪费
 */
class Singleton {
    //1.构造函数私有化，外部不能new
    private Singleton(){
    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static { //在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
