package Behavioral.commandDesignPattern2;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        AC ac = new AC();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command acOn = new AcOnCommand(ac);
        Command acOff = new AcOffCommand(ac);

        RemoteControl control = new RemoteControl();
        control.setCommand(0,lightOn);
        control.setCommand(1,lightOff);
        control.setCommand(2,acOn);
        control.setCommand(3,acOff);

        control.pressButton(0);
        control.pressButton(2);
        control.pressUndo();
        control.pressButton(1);
        control.pressUndo();
        control.pressUndo();

    }

}
