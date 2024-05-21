package factory_method;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:49
 *@description: 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
