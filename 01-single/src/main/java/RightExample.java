public class RightExample {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("摩托车");
        airVehicle.run("飞机");
        waterVehicle.run("游艇");

        System.out.println("-----------------");
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("船");
    }

}

/**
 * 方案2分析
 * 遵守了单一职责原则
 * 但是这样做改动很大，需要将类分解，同时修改客户端
 * 改进：直接修改Vehicle类，改动的代码会比较少
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上运行...");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上运行...");
    }
}

/**
 * 方案3分析
 * 没有对类做很大的修改，只是增加方法
 * 虽然没有在类级别上做单一职责原则，但是在方法级别上，仍是遵守单一职责
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上上运行...");
    }
}