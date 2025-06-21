package creational.factoryDesignPatternExample2;

public class FourWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle()
    {
        return new FourWheeler();
    }
}
