package simple_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:09
 *@description:
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//        SimpleFactory simpleFactory = new SimpleFactory();
//        Coffee coffee = simpleFactory.createCoffee(type);
        Coffee coffee = SimpleFactory.createCoffee(type);
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
