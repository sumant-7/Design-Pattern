package Factory;

public class TruckFactory implements Factory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
