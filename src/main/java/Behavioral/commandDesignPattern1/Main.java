package Behavioral.commandDesignPattern1;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new ACSetCommand(airConditioner,24));
        remoteControl.pressButton();
    }
}
