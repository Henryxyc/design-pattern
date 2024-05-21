package simple_factory;


/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:23
 *@description: 简单工厂/静态工厂模式（区别就是将方法改为静态方法可以直接类名.来创建咖啡对象）
 * 优点：将咖啡类和咖啡店解耦，新增咖啡品种不需要修改客户端代码。只需要修改SimpleFactory类就可以
 * 缺点：解除了咖啡和咖啡店的耦合，新增了咖啡店和SimpleFactory类的耦合，每次新增都要修改SimpleFactory类，违背了开闭原则
 */
public class SimpleFactory {
    public static Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        simple_factory.Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        return coffee;
    }
}
