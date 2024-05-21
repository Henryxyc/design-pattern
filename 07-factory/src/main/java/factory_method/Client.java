package factory_method;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:51
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
//        AmericanCoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        LatteCoffeeFactory coffeeFactory = new LatteCoffeeFactory();
        coffeeStore.setFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
