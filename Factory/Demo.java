package Factory;

public class Demo {
    private Vehicle vehicle;
    public Demo(Factory factory){
        this.vehicle = factory.createVehicle();
    }
    public void getVehicle(){
        vehicle.start();
        vehicle.stop();
        vehicle.describe();
    }

    public static void main(String[] args) {
        Factory factory = new TruckFactory();
        Demo demo = new Demo(factory);
        demo.getVehicle();
    }
}
