package headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.radio;

import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Command;

public class StrereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StrereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVol(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
