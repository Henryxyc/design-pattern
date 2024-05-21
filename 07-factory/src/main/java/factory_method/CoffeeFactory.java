package factory_method;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:47
 *@description: 咖啡的抽象工厂 工厂方法模式
 * 优点：解决了简单工厂模式中的问题，完全遵循开闭原则，用户只需要知道具体工厂的名称就可以得到想要的产品，无须知道产品的具体创建过程
 *      在系统增加新的产品时，只需要添加具体的产品类和对于的具体工厂类，无须对原工厂进行任何修改，满足开闭原则
 * 缺点：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度
 */
public interface CoffeeFactory {
    Coffee createCoffee();
}
