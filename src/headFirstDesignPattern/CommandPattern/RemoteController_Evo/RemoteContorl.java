package headFirstDesignPattern.CommandPattern.RemoteController_Evo;


public class RemoteContorl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteContorl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7 ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onComman, Command offCommand) {
        onCommands[slot] = onComman;
        offCommands[slot] = offCommand;

    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n-----------remote Controller ---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("슬롯 " + i +"// :" + onCommands[i].getClass().getName()+"      " + offCommands[i].getClass().getName() +"\n");
        }
        return stringBuffer.toString();
    }
}
