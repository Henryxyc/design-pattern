package ocp;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/6  21:46
 *@description:
 */
public class OcpRightExample {
    public static void main(String[] args) {
        GraphicEditor1 graphicEditor1 = new GraphicEditor1();
        graphicEditor1.drawShape(new Rectangle1());
        graphicEditor1.drawShape(new Circle1());
    }

}

/**
 * 这是一个用于绘图的类 这种方式每次修改无需修改调用方，只需添加新的类型继承Shape1即可，符合开闭原则
 */
class GraphicEditor1 {
    //这里是使用方，每次扩展都需要修改使用方，不满足开闭原则
    public void drawShape(Shape1 s) {
        s.draw();
    }
}

/**
 * Shape类 基类
 */
abstract class Shape1 {
    int m_type = 1;
    public abstract void draw();
}

/**
 * 矩形继承Shape基类
 */
class Rectangle1 extends Shape1 {
    Rectangle1() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

/**
 * 圆形继承Shape基类
 */
class Circle1 extends Shape1 {
    Circle1() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}