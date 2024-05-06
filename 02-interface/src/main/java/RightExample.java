public class RightExample {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());

        C1 c1 = new C1();
        c1.depend1(new D1());
        c1.depend4(new D1());
        c1.depend5(new D1());
    }
}

/**
 * 将interface接口拆分成几个独立的接口，类A和类C分别与他们需要的接口建立依赖关系，也就是接口隔离原则
 */
interface InterfaceBase {
    void method1();
}

interface Interface2 {
    void method2();
    void method3();
}

interface Interface3 {
    void method4();
    void method5();
}

class B1 implements InterfaceBase, Interface2 {

    @Override
    public void method1() {
        System.out.println("B1 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("B1 实现了method2");
    }

    @Override
    public void method3() {
        System.out.println("B1 实现了method3");
    }

}



class D1 implements InterfaceBase, Interface3 {

    @Override
    public void method1() {
        System.out.println("D1 实现了method1");
    }

    @Override
    public void method4() {
        System.out.println("D1 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("D1 实现了method5");
    }
}

class A1 {
    public void depend1(InterfaceBase i){
        i.method1();
    }

    public void depend2(Interface2 i){
        i.method2();
    }

    public void depend3(Interface2 i){
        i.method3();
    }
}

class C1 {
    public void depend1(InterfaceBase i){
        i.method1();
    }

    public void depend4(Interface3 i){
        i.method4();
    }

    public void depend5(Interface3 i){
        i.method5();
    }
}