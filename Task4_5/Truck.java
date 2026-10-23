package Task4_5;
public class Truck extends TransportVehicle {
        public Truck(String id) {
            super(id);
        }

        @Override
        public void billing() {
            System.out.println("卡车 [" + id + "]，计费启动...");
        }
    }

