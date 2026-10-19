package Task4_2;

public abstract class TransportVehicle {
    //定义一个抽象基类 TransportVehicle，包含受保护的属性 protected String vehicleId 和带参构造器。
    //声明一个抽象方法 abstract double calculateCost(double weight)。
    protected String vehicleId;
    private String location;

    public TransportVehicle(String vehicleId, String name) {
        this.vehicleId = vehicleId;
        this.name = name;
    }
    public abstract double calculateCost(double weight);

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
