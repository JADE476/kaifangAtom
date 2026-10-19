package Task4_2;

import javax.naming.Name;

public class Truck extends TransportVehicle implements GPSLocatable {
    public Truck(String vehicleId, String name) {
        super(vehicleId, name);
        this.setName(name);
    }



    @Override
    public double calculateCost(double weight) {
        return weight * 5.0;
    }
    @Override
    public String getLocation() {
        return "Warehouse A";
    }
}
