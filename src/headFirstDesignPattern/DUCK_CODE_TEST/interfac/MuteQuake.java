package headFirstDesignPattern.DUCK_CODE_TEST.interfac;

public class MuteQuake implements QuackBeheaver {
    @Override
    public void quack() {
        System.out.println("조용히 하라네요!");
    }
}
