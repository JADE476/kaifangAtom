package Task4_2;

public class test4_2 {
    /*题干：仓储系统不仅有商品，还有负责配送的运输体系。卡车和无人机都是运输工具，但它们的计费公式完全不同；
    同时，系统需要对所有具备定位功能的设备进行GPS追踪。请运用继承、抽象类和接口构建这个多态模型。
🎯要求：
Task1: 定义一个接口 GPSLocatable，包含一个抽象方法 String getLocation()。
Task2: 定义一个抽象基类 TransportVehicle，包含受保护的属性 protected String vehicleId 和带参构造器。
声明一个抽象方法 abstract double calculateCost(double weight)。
Task3: 创建子类 Truck (卡车) 和 Drone (无人机)，继承 TransportVehicle 并实现 GPSLocatable 接口。
卡车计费规则为：重量 * 5.0；无人机计费规则为：重量 * 15.0。
Task4: 在 main 方法中分别实例化卡车和无人机对象（请尝试使用父类 TransportVehicle 的引用指向子类对象），
调用它们的计费方法（假设重量为 10kg）和定位方法并打印。
🧠考察能力： extends 与 implements 的运用、抽象类（提炼共性模板）与接口（制定行为规范）的设计区分、
protected 访问控制、方法的重写（Override）以及多态的绝佳体现。
示例输出：
卡车 [T-998] 当前位置：仓库A区 | 配送10kg货物费用：50.0元
无人机 [D-007] 当前位置：高空坐标(39.9, 116.4) | 配送10kg货物费用：150.0元*/

    public static void main(String[] args) {
        TransportVehicle truck = new Truck("T-998", "卡车");
        TransportVehicle drone = new Drone("D-007", "无人机");
        GPSLocatable truckGPS = (GPSLocatable) truck;
        GPSLocatable droneGPS = (GPSLocatable) drone;
        System.out.println("卡车 [" + truck.getVehicleId() + "] 当前位置：" + truck.getLocation() + " | " + "配送10kg货物费用：" + truck.calculateCost(10) + "元");
        System.out.println("无人机 [" + drone.getVehicleId() + "] 当前位置：" + drone.getLocation() + " | " + "配送10kg货物费用：" + drone.calculateCost(10) + "元");
    }
}
