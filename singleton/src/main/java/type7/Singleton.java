package type7;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/7  23:18
 *@description:
 */

/**
 * 单例模式（枚举方式） 枚举方式属于是饿汉式
 * 枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性
 * 来实现单例模式，枚举的写法非常简单，而且枚举类型是所有单例实现中唯一一种不会被破坏的单例模式实现
 */
public enum Singleton {
    INSTANCE;
}
