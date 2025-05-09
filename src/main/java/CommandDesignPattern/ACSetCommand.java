package CommandDesignPattern;

public class ACSetCommand implements Command{
    AirConditioner airConditioner;
    int temperature;
    public ACSetCommand(AirConditioner airConditioner,int temperature)
    {
        this.airConditioner = airConditioner;
        this.temperature = temperature;
    }
    public void execute()
    {
        airConditioner.setTemperature(temperature);
    }
}
