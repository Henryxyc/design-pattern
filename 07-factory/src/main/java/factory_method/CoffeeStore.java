package factory_method;

import simple_factory.SimpleFactory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:09
 *@description:
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
