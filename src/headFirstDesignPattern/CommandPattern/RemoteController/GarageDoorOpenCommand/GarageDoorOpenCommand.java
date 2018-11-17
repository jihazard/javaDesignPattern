package headFirstDesignPattern.CommandPattern.RemoteController.GarageDoorOpenCommand;

import headFirstDesignPattern.CommandPattern.RemoteController.interface_.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
