package headFirstDesignPattern.CommandPattern.RemoteController;

import headFirstDesignPattern.CommandPattern.RemoteController.GarageDoorOpenCommand.GarageDoor;
import headFirstDesignPattern.CommandPattern.RemoteController.GarageDoorOpenCommand.GarageDoorOpenCommand;
import headFirstDesignPattern.CommandPattern.RemoteController.LightOnCommand.Light;
import headFirstDesignPattern.CommandPattern.RemoteController.LightOnCommand.LightOnCommand;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote= new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand =new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();


    }
}
