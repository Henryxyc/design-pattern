/**
 * 单一职责原则
 */
public class ErrorExample {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }

}


/**
 * 1.违反了单一指责原则
 */
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }
}