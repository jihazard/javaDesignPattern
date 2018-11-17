package headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.light;

import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
