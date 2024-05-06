/**
 * 接口隔离原则
 */
public class ErrorExample {
    public static void main(String[] args) {

    }
}

/**
 * A需要依赖于B实现method1、method2、method3方法
 * C需要依赖于D实现method1、method4、method5方法
 */
interface Interface1 {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements Interface1{

    @Override
    public void method1() {
        System.out.println("B 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了method3");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了method3");
    }

    @Override
    public void method4() {
        System.out.println("B 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("B 实现了method5");
    }
}


class D implements Interface1{

    @Override
    public void method1() {
        System.out.println("D 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("D 实现了method3");
    }

    @Override
    public void method3() {
        System.out.println("D 实现了method3");
    }

    @Override
    public void method4() {
        System.out.println("D 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("D 实现了method5");
    }
}

/**
 * A通过接口Interface1 依赖B类，但只会用到1、2、3但是B却要实现1-5个方法
 */
class A {
    public void depend1(Interface1 i){
        i.method1();
    }

    public void depend2(Interface1 i){
        i.method1();
    }

    public void depend3(Interface1 i){
        i.method1();
    }
}