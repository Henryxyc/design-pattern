package abstract_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:14
 *@description:
 */
public interface DessertFactory {
    //生产咖啡的功能
    Coffee createCoffee();

    //上产甜品的功能
    Dessert createDessert();
}
