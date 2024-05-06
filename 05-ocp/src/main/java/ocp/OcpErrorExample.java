package ocp;


/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/6  21:35
 *@description:开闭原则：对扩展开放（提供方），对修改（调用方）关闭
 */
public class OcpErrorExample {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

/**
 * 这是一个用于绘图的类
 */
class GraphicEditor {
    //这里是使用方，每次扩展都需要修改使用方，不满足开闭原则
    public void drawShape(Shape s) {
        if (s.m_type == 2){
            drawRectangle(s);
        } else if (s.m_type == 3){
            drawCircle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }
}

/**
 * Shape类 基类
 */
class Shape {
    int m_type = 1;
}

/**
 * 矩形继承Shape基类
 */
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 2;
    }
}

/**
 * 圆形继承Shape基类
 */
class Circle extends Shape {
    Circle(){
        super.m_type = 3;
    }
}