package creational.factoryDesignPatternExample2;

public class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle()
    {
        return new TwoWheeler();
    }
}
