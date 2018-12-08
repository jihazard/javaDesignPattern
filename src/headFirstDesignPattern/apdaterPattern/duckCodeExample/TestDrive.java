package headFirstDesignPattern.apdaterPattern.duckCodeExample;

import headFirstDesignPattern.DUCK_CODE_TEST.MallarDuck;

public class TestDrive {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdaper = new TurkeyAdapter(turkey);

        System.out.println("---------------the turkey says :---");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n the duck says :");
       // testDuck(duck);

        System.out.println("\n the turkeyAdapter says....");
        testDuck(turkeyAdaper);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
