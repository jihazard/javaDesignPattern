package headFirstDesignPattern.CommandPattern.RemoteController_Evo;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("노 커맨드");
    }

    @Override
    public void undo() {
        System.out.println("언도 노커맨드");
    }
}
