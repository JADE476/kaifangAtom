package Task4_5;


    // Task2 前置：交通工具体系
   public  abstract class TransportVehicle {
        protected final  String id;

        public TransportVehicle(String id) {
            this.id = id;
        }

        public abstract void billing();   // 计费方法

        public String getId() {
            return id;
        }
    }


