package headFirstDesignPattern.CommandPattern.RemoteController_Evo;

import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.light.Light;
import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.light.LightOffCommand;
import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.light.LightOnCommand;
import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.radio.Stereo;
import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.radio.StereoOffCommand;
import headFirstDesignPattern.CommandPattern.RemoteController_Evo.Commands.radio.StrereoOnWithCDCommand;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteContorl remoteContorl = new RemoteContorl();

        Light livingRoom = new Light("kitchen");
        Stereo radio = new Stereo("리빙룸");


        LightOffCommand lightOffCommand = new LightOffCommand(livingRoom);
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoom);

        StereoOffCommand stereoOffCommand = new StereoOffCommand(radio);
        StrereoOnWithCDCommand strereoOnWithCDCommand = new StrereoOnWithCDCommand(radio);

        remoteContorl.setCommand(0,lightOnCommand, lightOffCommand);
        remoteContorl.setCommand(1,strereoOnWithCDCommand,stereoOffCommand);

        System.out.println(remoteContorl);

        remoteContorl.onButtonWasPushed(0);
        remoteContorl.offButtonWasPushed(0);

        remoteContorl.undoButtonWasPushed();

        remoteContorl.onButtonWasPushed(1);
        remoteContorl.offButtonWasPushed(1);

        for (int i = 0; i <=10 ; i++) {
            i +=5;
            System.out.println("---" + i);
        }

    }
}
