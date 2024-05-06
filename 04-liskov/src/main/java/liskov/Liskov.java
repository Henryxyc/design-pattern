package liskov;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/6  21:08
 *@description: 里氏替换原则（继承会对代码造成入侵性，如何正确使用继承，需要使用里氏替换原则，避免调用者错误的认为调用逻辑）
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));
        System.out.println(a.fun1(1,8));
        System.out.println("--------------------");
        B b = new B();
        System.out.println(b.fun1(11, 3));
        System.out.println(b.fun1(1,8));
    }
}

class A {
    public int fun1(int num1, int num2){
        return num1 - num2;
    }
}

/**
 * B继承了A类
 * B本意是返回两个数相加 然后+9求和，无意间重写了fun1
 */
//class B extends A {
class B extends Base {
    //如果B想要使用A的方法，使用组合的关系
    private A a = new A();



    @Override
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2){
//        return fun1(num1, num2) + 9;
        return a.fun1(num1, num2) + 9;
    }
}


/**
 * 解决方法，使用组合的关系，新增一个基类，A和B都继承base类
 */
class Base {
    public int fun1(int num1, int num2){
        return num1 + num2;
    }
}