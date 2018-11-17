package headFirstDesignPattern.CommandPattern.RemoteController.LightOnCommand;


import headFirstDesignPattern.CommandPattern.RemoteController.interface_.Command;

public class LightOnCommand implements Command {
   Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
