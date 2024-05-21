package simple_factory;



/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:12
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
