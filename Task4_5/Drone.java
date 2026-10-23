package Task4_5;

public class Drone extends TransportVehicle {
    public Drone(String id) {
        super(id);
    }

    @Override
    public void billing() {
        System.out.println("无人机 [" + id + "]，计费启动...");
    }
}
