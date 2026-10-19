package Task4_2;

public class Drone extends TransportVehicle implements GPSLocatable {
    public Drone(String vehicleId, String name) {
        super(vehicleId,name);
        this.setName(name);
    }
    @Override
    public double calculateCost(double weight) {
        return weight * 15.0;
    }
    @Override
    public String getLocation() {
        return "High Altitude";
    }
}
