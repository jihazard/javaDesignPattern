package headFirstDesignPattern.DUCK_CODE_TEST.interfac;

public class Quack  implements QuackBeheaver {
    @Override
    public void quack() {
        System.out.println("퀘엑 퀘엑 오리가 울고있어요!");
    }
}
