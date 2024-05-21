package abstract_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:16
 *@description: 美式风味的甜品工厂 生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
