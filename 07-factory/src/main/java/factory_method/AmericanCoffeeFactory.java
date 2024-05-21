package factory_method;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:48
 *@description: 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
