package config_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:44
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
