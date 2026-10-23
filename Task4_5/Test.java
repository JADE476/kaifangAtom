package Task4_5;

public class Test {
    public static void main(String[] args) {
        //Task1 单例测试
        LogisticsConfig a = LogisticsConfig.getInstance();
        LogisticsConfig b = LogisticsConfig.getInstance();
        System.out.println("单例测试：配置类实例A与实例B是否相同？ -> " + (a == b));



        // Task2 工厂测试
        TransportVehicle vehicle = VehicleFactory.createVehicle("Drone");
        System.out.print("工厂调度：工厂成功分配 -> ");
        vehicle.billing();

        // Task3 建造者测试
        LogisticsOrder order = new LogisticsOrder.Builder("OD-999")
                .sender("Alice")
                .receiver("Bob")
                .fragile(true)
                .insuredAmount(1000.0)
                .build();
        System.out.println("运单生成：" + order);
    }
}
