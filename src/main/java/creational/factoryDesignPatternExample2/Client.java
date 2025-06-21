package creational.factoryDesignPatternExample2;

public class Client {
    private Vehicle pVehicle;
    public Client(VehicleFactory vehicle)
    {
        pVehicle = vehicle.createVehicle();
    }
    public Vehicle getVehicle() {
        return pVehicle;
    }
}
