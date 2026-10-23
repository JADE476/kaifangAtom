package Task4_5;

public class VehicleFactory {
    // 简单工厂核心：一个静态方法，根据参数返回不同产品
    public static TransportVehicle createVehicle(String type) {
        if ("Truck".equalsIgnoreCase(type)) {
            return new Truck("T-001");
        } else if ("Drone".equalsIgnoreCase(type)) {
            return new Drone("D-007");
        }
        return null;
    }
}